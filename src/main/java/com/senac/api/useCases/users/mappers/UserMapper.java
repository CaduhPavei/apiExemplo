package com.senac.api.useCases.users.mappers;


import com.senac.api.model.User;
import com.senac.api.useCases.users.domains.UserRequestDom;
import com.senac.api.useCases.users.domains.UserResponseDom;

public class UserMapper {
    public static User userRequestDomToUser(UserRequestDom input){
        User output = new User();
        output.setLogin(input.getLogin());
        output.setPassword(input.getPassword());

        return output;
    }

    public static UserResponseDom userToUserResponseDom(User input){
        UserResponseDom output = new UserResponseDom();
        output.setId(input.getId());
        output.setLogin(input.getLogin());

        return output;
    }
}
