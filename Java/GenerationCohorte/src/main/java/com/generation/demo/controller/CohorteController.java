package com.generation.demo.controller;

import com.generation.demo.model.Cohorte;
import com.generation.demo.service.CohorteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/cohorte")
public class CohorteController {

    // INYECTAR SERVICIO EN EL CONTROLADOR
    private CohorteService cohorteService;
    public CohorteController(@Autowired CohorteService cohorteService){
        this.cohorteService = cohorteService;
    }

    @GetMapping("/{id}")
    public Cohorte getCohorte(@PathVariable Integer id){
        return cohorteService.getCohorte(id);
    }

    @GetMapping("/all")
    public List<Cohorte> conseguirCohortes(){
        return cohorteService.conseguirCohorte();
    }

    @PostMapping
    public Cohorte saveCohorte(@RequestBody Cohorte cohorte){
        return cohorteService.saveCohorte(cohorte);
    }

    @GetMapping("/city")
    public List<Cohorte> getCohortesByCiudad(@RequestParam(value="ciudad", defaultValue="") String ciudad) {
        return cohorteService.getCohortesByCiudad(ciudad);
    }

    @GetMapping("/InstAlum")
    public List<Map<String, Object>> getInstructorAlumno() {
        return cohorteService.getInstructorAlumno();
    }
}
