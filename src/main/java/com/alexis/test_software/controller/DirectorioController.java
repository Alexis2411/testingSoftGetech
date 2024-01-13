package com.alexis.test_software.controller;

import com.alexis.test_software.model.Persona;
import com.alexis.test_software.service.DirectorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/directorio")
public class DirectorioController {

    @Autowired
    private DirectorioService directorioService;

    @PostMapping("/persona")
    public Persona storePersona(@RequestBody Persona persona) {
        return directorioService.storePersona(persona);
    }

    @GetMapping("/{identificacion}")
    public Persona findPersonaByIdentificacion(@PathVariable String identificacion) {
        return directorioService.findPersonasByIdentificacion(identificacion);
    }

    @DeleteMapping("/{identificacion}")
    public void deletePersonaByIdentificacion(@PathVariable String identificacion) {
        directorioService.deletePersonaByIdentificacion(identificacion);
    }

    @GetMapping("/")
    public List<Persona> findPersonas() {
        return directorioService.findPersonas();
    }
}