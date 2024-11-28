package com.onesystem.onesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.onesystem.onesystem.model.Profesor;
import com.onesystem.onesystem.service.ProfesorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profesores")
public class ProfesorController {
    private ProfesorService profesorService;

    public ProfesorController(@Autowired ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    public ResponseEntity<List<Profesor>> getAllProfesores() {
        return ResponseEntity.ok(profesorService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesor> getProfesorById(@PathVariable String id) {
        Profesor profesor = profesorService.getById(id);
        return profesor != null ? ResponseEntity.ok(profesor) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Profesor> createProfesor(@RequestBody Profesor profesor) {
        return ResponseEntity.ok(profesorService.create(profesor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profesor> updateProfesor(@PathVariable String id, @RequestBody Profesor updatedProfesor) {
        Profesor profesor = profesorService.update(id, updatedProfesor);
        return profesor != null ? ResponseEntity.ok(profesor) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfesor(@PathVariable String id) {
        profesorService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/calificar")
    public String calificar(@PathVariable String id) {
        return "El profesor con ID " + id + " está calificando.";
    }

    @PostMapping("/{id}/preparar-clase")
    public String prepararClase(@PathVariable String id) {
        return "El profesor con ID " + id + " está preparando una clase.";
    }
}
