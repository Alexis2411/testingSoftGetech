package com.alexis.test_software.service;
import com.alexis.test_software.model.Factura;
import com.alexis.test_software.model.Persona;
import com.alexis.test_software.repository.FacturaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacturaService.class);

    @Autowired
    private FacturaRepository facturaRepository;

    public Factura storeFactura(Factura factura) {
        LOGGER.info("Saving factura: {}", factura);
        return facturaRepository.save(factura);
    }

    public List<Factura> findFacturasByPersona(Persona persona) {
        LOGGER.info("Finding facturas by persona: {}", persona);
        return facturaRepository.findByPersona(persona);
    }
}