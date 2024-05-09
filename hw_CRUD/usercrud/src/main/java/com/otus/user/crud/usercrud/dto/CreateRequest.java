package com.otus.user.crud.usercrud.dto;

import lombok.Data;

@Data
public class CreateRequest {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
