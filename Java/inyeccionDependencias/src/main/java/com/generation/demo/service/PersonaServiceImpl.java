package com.generation.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    public String registro(String nombre){

        return "El usuario " + nombre + " ha sido registrado";
    }

    public int calcular(int a, int b){
        return a+b;
    }
}
