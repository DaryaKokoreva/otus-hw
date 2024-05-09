package com.otus.user.crud.usercrud.dto;

import lombok.Data;

@Data
public class CreateResponse {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
