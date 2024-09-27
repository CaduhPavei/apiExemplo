package com.senac.api.controller;

import com.senac.api.useCases.users.UserService;
import com.senac.api.useCases.users.domains.UserRequestDom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserRequestDom user) {
        try {
            return ResponseEntity.ok(userService.createUser(user));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro não mapeado: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserRequestDom user){
        try{
            return ResponseEntity.ok(userService.loginUsuario(user));
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Erro não mapeado: " + e.getMessage());
        }
    }
}

