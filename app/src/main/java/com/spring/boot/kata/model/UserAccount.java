package com.spring.boot.kata.model;


import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Data
public class UserAccount {
    @NotBlank
    private String userName;
    @NotNull
    @Size(min = 4, max = 15)
    private String password;
}
