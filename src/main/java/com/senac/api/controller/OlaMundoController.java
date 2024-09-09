package com.senac.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/olaMundo")
public class OlaMundoController {

    @GetMapping("/teste")
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok("Olá Mundo!");
    }
}
