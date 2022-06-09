package com.generation.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.generation.demo.model.Cohorte;
import com.generation.demo.service.CohorteService;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })
@RequestMapping("api/cohorte")
public class CohorteController {
	
	private final CohorteService cohorteService;
	
	public CohorteController(@Autowired CohorteService cohorteService) {
		this.cohorteService = cohorteService;
	}
	
	// Leer
	@GetMapping("/{id}")
	public Cohorte getCohorte(@PathVariable Integer id) {
		return cohorteService.getCohorte(id);
	}
	
	@GetMapping("/all")
	public List<Cohorte> getCohortes(){
		return cohorteService.getCohortes();
	}
	
	@GetMapping("/ciudad")
	public List<Cohorte> getCohortesByCiudad(@RequestParam(value = "nombre", defaultValue = "") String ciudad) {
		return cohorteService.getCohortesByCiudad(ciudad);
	}
	
	@GetMapping("/InstructorAlumno")
	public List<Map<String, Object>> getInstructoresAlumnos(){
		return cohorteService.getInstructoresAlumnos();
	}
	
	// Escribir 
	@PostMapping
	public Cohorte saveCohorte(@RequestBody Cohorte cohorte) {
		return cohorteService.saveCohorte(cohorte);
	}
	
	// Borrar
	@DeleteMapping("delete/{id}")
	public void deleteCohorte(@PathVariable Integer id) {
		cohorteService.deleteCohorte(id);
	}
	
	// Actualizar
	@PutMapping
	public Cohorte updateCohorte(@RequestBody Cohorte cohorte) {
		return cohorteService.updateClase(cohorte);
	}
}
