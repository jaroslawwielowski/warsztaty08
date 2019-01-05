package com.example.warsztaty08.Dto;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.text.View;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class UserDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotEmpty
    private String login;

    @NotBlank
    @NotEmpty
    private String password;

    private String administrativeRights;

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdministrativeRights() {
        return administrativeRights;
    }

    public void setAdministrativeRights(String administrativeRights) {
        this.administrativeRights = administrativeRights;
    }
}
