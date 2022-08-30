package com.misiontic.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
public class HolaMundoController {

    @GetMapping
    public String sayHi(){
        return "Hola";
    }
}
