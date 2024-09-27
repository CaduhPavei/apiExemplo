package com.senac.api.useCases.itens;

import com.senac.api.jwt.TokenService;
import com.senac.api.useCases.itens.repository.ItensRepository;
import com.senac.api.useCases.users.repositoriy.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItensRepository userRepository;

}
