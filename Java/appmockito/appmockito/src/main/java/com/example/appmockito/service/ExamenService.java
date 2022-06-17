package com.example.appmockito.service;

import com.example.appmockito.model.Examen;

public interface ExamenService {
    Examen findExamenPorNombre(String nombre);
}
