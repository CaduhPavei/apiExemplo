package com.senac.api.useCases.itens;

import com.senac.api.useCases.itens.repository.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItensRepository userRepository;

}
