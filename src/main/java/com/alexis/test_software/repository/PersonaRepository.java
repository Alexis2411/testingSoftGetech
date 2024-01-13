package com.alexis.test_software.repository;

import com.alexis.test_software.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Persona findByIdentificacion(String identificacion);
    List<Persona> findAll();
    Persona save(Persona persona);
}
