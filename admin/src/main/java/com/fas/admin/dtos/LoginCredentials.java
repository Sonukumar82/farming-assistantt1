package com.fas.admin.dtos;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;


public class LoginCredentials {
    @NotNull
    @Length(min = 6, max = 16, message = "Username should be of length b/w 6 and 16")
    private String username;
    @NotNull
    @Length(min = 8, max = 16, message = "Password should be of length b/w 6 and 16")
    private String password;

    public LoginCredentials(String username,String password) {
        this.username = username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
