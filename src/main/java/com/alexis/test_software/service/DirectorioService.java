package com.alexis.test_software.service;

import com.alexis.test_software.model.Persona;
import com.alexis.test_software.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class DirectorioService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DirectorioService.class);

    @Autowired
    private PersonaRepository personaRepository;

    public Persona storePersona(Persona persona) {
        LOGGER.info("Saving persona: {}", persona);
        return personaRepository.save(persona);
    }

    public Persona findPersonasByIdentificacion(String identificacion) {
        LOGGER.info("Finding persona by identificacion: {}", identificacion);
        return personaRepository.findByIdentificacion(identificacion);
    }

    public List<Persona> findPersonas() {
        LOGGER.info("Finding personas");
        return personaRepository.findAll();
    }

    public void deletePersonaByIdentificacion(String identificacion) {
        LOGGER.info("Deleting persona by identificacion: {}", identificacion);
        Persona persona = personaRepository.findByIdentificacion(identificacion);
        if (persona != null) {
            personaRepository.delete(persona);
        }
    }

}
