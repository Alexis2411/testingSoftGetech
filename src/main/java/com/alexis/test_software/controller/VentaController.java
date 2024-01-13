package com.alexis.test_software.controller;

import com.alexis.test_software.model.Factura;
import com.alexis.test_software.model.Persona;
import com.alexis.test_software.repository.FacturaRepository;
import com.alexis.test_software.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/venta")
public class VentaController {
    @Autowired
    private FacturaService facturaService;

    @PostMapping("/factura")
    public Factura storePersona(@RequestBody Factura factura) {
        return facturaService.storeFactura(factura);
    }

    @GetMapping("/{identificacion}")
    public List<Factura> findFacturaByPersona(@PathVariable Persona persona) {
        return facturaService.findFacturasByPersona(persona);
    }

}
