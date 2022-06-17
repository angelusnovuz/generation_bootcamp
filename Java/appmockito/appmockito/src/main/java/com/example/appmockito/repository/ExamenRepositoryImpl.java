package com.example.appmockito.repository;

import com.example.appmockito.model.Examen;

import java.util.Arrays;
import java.util.List;

public class ExamenRepositoryImpl implements ExamenRepository{

    @Override
    public List<Examen> findAll(){
        return Arrays.asList(
                new Examen(1L, "Historia"),
                new Examen(2L, "Matematicas"),
                new Examen(3L, "IA"),
                new Examen(4L, "Programacion"));
    }
}
