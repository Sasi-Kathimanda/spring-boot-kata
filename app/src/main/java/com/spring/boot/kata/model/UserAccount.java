package com.spring.boot.kata.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
public class UserAccount {
    @NotBlank
    private String userName;
    @NotNull
    @Size(min = 4, max = 15)
    private String password;
}
