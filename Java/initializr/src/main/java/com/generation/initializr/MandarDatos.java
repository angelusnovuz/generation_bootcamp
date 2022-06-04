package com.generation.initializr;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/mandardatos") // prefijo para todas la peticiones
public class MandarDatos {

    @GetMapping("/saludo")
    public String saludo(){
        return "Te vuelvo a saludar";
    }

    // Pedir datos
    @GetMapping("/mandarsaludos")
    public String mandarSaludo(@RequestParam(value = "nombre", defaultValue = "C12") String nombre,
                                @RequestParam(value = "apellido", defaultValue = "Mexico") String apellido){
        return "Te vuelvo a saludar " + nombre + " " + apellido;
    }
}
