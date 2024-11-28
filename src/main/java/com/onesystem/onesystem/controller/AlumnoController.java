package com.onesystem.onesystem.controller;

import java.util.List;
import com.onesystem.onesystem.model.Alumno;
import com.onesystem.onesystem.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    private AlumnoService alumnoService;

    public AlumnoController(@Autowired AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public ResponseEntity<List<Alumno>> getAllAlumnos() {
        return ResponseEntity.ok(alumnoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable String id) {
        Alumno alumno = alumnoService.getById(id);
        return alumno != null ? ResponseEntity.ok(alumno) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno) {
        return ResponseEntity.ok(alumnoService.create(alumno));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alumno> updateAlumno(@PathVariable String id, @RequestBody Alumno updatedAlumno) {
        Alumno alumno = alumnoService.update(id, updatedAlumno);
        return alumno != null ? ResponseEntity.ok(alumno) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlumno(@PathVariable String id) {
        alumnoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{id}/estudiar")
    public String estudiar(@PathVariable String id) {
        return "El alumno con ID " + id + " está estudiando.";
    }

}
