package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data //Método lombok para não ser necessário criar getters e setters
@JsonInclude(JsonInclude.Include.NON_NULL) //Para ignorar valores nulos
public class UserDto {

    private UUID userId;
    private String userName;
    private String email;
    private String password;
    private String oldPassword;
    private String fullName;
    private String phoneNumber;
    private String cpf;
    private String imagUrl;


}
