package com.senac.api.useCases.users;

import com.senac.api.jwt.TokenService;
import com.senac.api.model.User;
import com.senac.api.useCases.users.domains.UserRequestDom;
import com.senac.api.useCases.users.domains.UserResponseDom;
import com.senac.api.useCases.users.mappers.UserMapper;
import com.senac.api.useCases.users.repositoriy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private TokenService tokenService;

    public UserResponseDom createUser(UserRequestDom user) {
        User userPersist = UserMapper.userRequestDomToUser(user);
        userPersist.setPassword(passwordEncoder.encode(user.getPassword()));
        User userResult = userRepository.save(userPersist);

        return UserMapper.userToUserResponseDom(userResult);
    }

    public UserResponseDom loginUsuario(UserRequestDom user) throws Exception {
        Optional<User> userResult = userRepository.findByLogin(user.getLogin());

        if(userResult.isPresent()){
            if(passwordEncoder.matches(user.getPassword(), userResult.get().getPassword())){
                String token = tokenService.gerarToken(userResult.get());

                UserResponseDom userReturn = UserMapper.userToUserResponseDom(userResult.get());

                userReturn.setToken(token);

                return userReturn;
            }
            throw new Exception("Senha inválida.");
        }
        throw new Exception("Usuário não encontrado!");
    }
}