package com.senac.api.useCases.users.domains;

import com.senac.api.model.User;

import java.util.List;

public class UserResponseDom {
    private Long id;
    private String login;
    private String token;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserList(List<User> userList) {
    }

    public void setUser(User user) {
    }

    public void setErrorMessage(String user_not_found) {
    }
}
