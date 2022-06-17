package com.example.appmockito.repository;

import com.example.appmockito.model.Examen;

import java.util.List;

public interface ExamenRepository {

    List<Examen> findAll();
}
