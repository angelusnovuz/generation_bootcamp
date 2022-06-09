package com.generation.demo.service;
import com.generation.demo.model.Cohorte;

import java.util.List;
import java.util.Map;

public interface CohorteService {

    //TIENE METODOS VACIOS
    // LAS CLASES QUE LO IMPLEMENTAN DEBEN CUMPLIR CON LOS METODOS VACIOS DECLARADOS
    // INSERTAR OPERACIONES DE CRUD

    //LEER
    Cohorte getCohorte(Integer id); //leer una sola cohorte con el id indicado

    List<Cohorte> conseguirCohorte(); // leer todas las cohortes

    List<Cohorte> getCohortesByCiudad(String ciudad);

    List<Map<String, Object>> getInstructorAlumno();

    //ESCRIBIR
    Cohorte saveCohorte(Cohorte cohorte); // guardar la cohorte enviada


    //ACTUALIZAR

    //BORRAR

}
