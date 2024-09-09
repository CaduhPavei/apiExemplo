package com.senac.api.useCases.users;

import com.senac.api.entities.User;
import com.senac.api.useCases.domains.UserRequestDom;
import com.senac.api.useCases.domains.UserResponseDom;
import com.senac.api.useCases.mappers.UserMapper;
import com.senac.api.useCases.users.repositoriy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserResponseDom createUser(UserRequestDom user) {
        User userPersist = UserMapper.userRequestDomToUser(user);

        userPersist.setPassword(passwordEncoder.encode(user.getPassword()));

        User userResult = userRepository.save(userPersist);

        return UserMapper.userToUserResponseDom(userResult);
    }
}