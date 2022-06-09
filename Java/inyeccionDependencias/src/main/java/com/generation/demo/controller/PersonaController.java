package com.generation.demo.controller;

import com.generation.demo.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.generation.demo.service.PersonaServiceImpl;

@RestController
@RequestMapping("/api") //url
public class PersonaController {
    private PersonaServiceImpl personaServiceImpl;

    @Autowired
    public PersonaController(PersonaServiceImpl personaServiceImpl){
        this.personaServiceImpl = personaServiceImpl;
    }

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola";
    }

    @GetMapping("/registro")
    public String registro(@RequestParam(value="nombre", defaultValue="Desconocido")String nombre){
        return personaServiceImpl.registro(nombre);
    }

    @GetMapping("/calcular")
    public int calcular(@RequestParam(value="num1") int a, @RequestParam(value = "num2") int b){
        return personaServiceImpl.calcular(a, b);
    }

}
