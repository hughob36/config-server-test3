package com.exampleApiPokemon.pokemon_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class PruebaController {

    @GetMapping
    public String saludo() {
        return "Hola socio.";
    }
}
