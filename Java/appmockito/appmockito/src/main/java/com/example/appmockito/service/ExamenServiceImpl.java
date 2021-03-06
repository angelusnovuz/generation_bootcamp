package com.example.appmockito.service;

import com.example.appmockito.model.Examen;
import com.example.appmockito.repository.ExamenRepository;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService {

    private ExamenRepository examenRepository;

    public ExamenServiceImpl(){
    }

    public ExamenServiceImpl(ExamenRepository examenRepository){
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenPorNombre(String nombre){
        Optional<Examen> examenOptional = examenRepository.findAll()
                .stream()
                .filter(e -> e.getNombre().contains(nombre))
                .findFirst();
        Examen examen = null;
        if (examenOptional.isPresent()){
            examen = examenOptional.orElseThrow();
        }
        return examen;
    }
}
