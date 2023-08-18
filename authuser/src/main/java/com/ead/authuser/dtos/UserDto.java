package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.UUID;

@Data //Método lombok para não ser necessário criar getters e setters
@JsonInclude(JsonInclude.Include.NON_NULL) //Para ignorar valores nulos
public class UserDto {

    public interface UserView {
        public static interface RegistrationPost {} //cadastro do usuári
        public static interface UserPut {} //atualização informações do usuário
        public static interface PasswordPut {} //atualização de senha do usuário
        public static interface ImagePut {} // autalização da imgagem de perfil do usuário
    }

    private UUID userId;

    @JsonView(UserView.RegistrationPost.class)
    private String userName;

    @JsonView(UserView.RegistrationPost.class)
    private String email;

    @JsonView({UserView.RegistrationPost.class, UserView.PasswordPut.class})
    private String password;

    @JsonView(UserView.PasswordPut.class)
    private String oldPassword;

    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    private String fullName;

    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    private String phoneNumber;

    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    private String cpf;

    @JsonView(UserView.ImagePut.class)
    private String imagUrl;


}
