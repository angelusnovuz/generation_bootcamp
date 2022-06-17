package com.example.appmockito.service;

import com.example.appmockito.model.Examen;
import com.example.appmockito.repository.ExamenRepository;
import com.example.appmockito.repository.ExamenRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExamenServiceImplTest {
    @Test
    void  findExamplePorNombre(){
        ExamenRepository repository = new ExamenRepositoryImpl();
        ExamenService service = new ExamenServiceImpl(repository);
        Examen examen = service.findExamenPorNombre("IA");
        assertNotNull(examen);
        assertEquals(3L, examen.getId());
        assertEquals("IA", examen.getNombre());
    }
}
