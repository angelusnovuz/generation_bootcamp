package com.generation.demo.service;

import com.generation.demo.repository.CohorteRepository;
import com.generation.demo.model.Cohorte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Map;
@Service
public class CohorteServiceImpl implements CohorteService {

    // No podemos crear un objeto a partir de un interface
    CohorteRepository cohorteRepository;

//    CohorteService cohorteService = new CohorteServiceImpl();

    public CohorteServiceImpl(@Autowired CohorteRepository cohorteRepository){
        this.cohorteRepository = cohorteRepository;
    }

    @Override
    public Cohorte getCohorte(Integer id) {
        Optional<Cohorte> cohorte = cohorteRepository.findById(id);
        return cohorte.orElse(null);
    }

    @Override
    public List<Cohorte> conseguirCohorte() {
        return cohorteRepository.findAll();
    }

    @Override
    public List<Cohorte> getCohortesByCiudad(String ciudad) {
        return cohorteRepository.findByCiudad(ciudad);
    }

    @Override
    public List<Map<String, Object>> getInstructorAlumno() {
        return cohorteRepository.obtenerInstructorAlumno();
    }

    @Override
    public Cohorte saveCohorte(Cohorte cohorte) {
        return cohorteRepository.save(cohorte);
    }
}
