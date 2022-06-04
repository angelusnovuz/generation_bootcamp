package com.generation.initializr;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {

    // Peticiones WEB
    // GET, POST, DELETE, PUT

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola a todos";
    }

    // Peticion para pedir información
    @GetMapping("/holaspring")
    public String holaSpring(){
        return "Hola a todos desde Spring";
    }

    // Peticion para guardar información
    @PostMapping("/login")
    public String login(){
        return "Registro exitoso";
    }

}
