package com.alexis.test_software.repository;

import com.alexis.test_software.model.Factura;
import com.alexis.test_software.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
    List<Factura> findByPersona(Persona persona);
}
