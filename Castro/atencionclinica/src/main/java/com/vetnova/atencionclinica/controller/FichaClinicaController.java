package com.vetnova.atencionclinica.controller;

import com.vetnova.atencionclinica.model.FichaClinica;
import com.vetnova.atencionclinica.service.FichaClinicaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/fichas")
public class FichaClinicaController {

    @Autowired
    private FichaClinicaService service;

    @GetMapping
    public ResponseEntity<?> getFichas() {
        List<FichaClinica> lista = service.findAll();
        if (lista.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Recursos no encontrados");
        }
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<?> postFicha(@Valid @RequestBody FichaClinica ficha) {
        FichaClinica nuevaFicha = service.save(ficha);
        if (nuevaFicha != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevaFicha);
        }
        return ResponseEntity.badRequest().body("Datos inválidos al crear la ficha");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFichaById(@PathVariable Long id) {
        Optional<FichaClinica> ficha = service.findById(id);
        if (ficha.isPresent()) {
            return ResponseEntity.ok(ficha.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ficha clínica no encontrada");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFicha(@PathVariable Long id) {
        if (service.findById(id).isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se pudo eliminar: Ficha no encontrada");
    }
}