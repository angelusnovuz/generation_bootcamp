package com.generation.demo.repository;



import com.generation.demo.model.Cohorte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CohorteRepository extends JpaRepository<Cohorte, Integer> {

    // METDOSO PERSONALIZADOS

    // Buscar por la ciudad
    List<Cohorte> findByCiudad(String ciudad);

    @Query(value = "SELECT id_instructor, nombre_instructor, nombre_alumno FROM instructor inner join alumno on instructor.cohorte_id = alumno.cohorte_id;", nativeQuery = true)
    List<Map<String,Object>> obtenerInstructorAlumno();

}
