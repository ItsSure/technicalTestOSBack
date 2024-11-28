package com.onesystem.onesystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.onesystem.onesystem.model.Profesor;

@Service
public class ProfesorService implements UniversidadService<Profesor> {
    private final List<Profesor> profesores = new ArrayList<>();

    @Override
    public List<Profesor> getAll() {
        return profesores;
    }

    @Override
    public Profesor getById(String id) {
        return profesores.stream()
                .filter(profesor -> profesor.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Profesor create(Profesor profesor) {
        profesores.add(profesor);
        return profesor;
    }

    @Override
    public Profesor update(String id, Profesor updatedProfesor) {
        Optional<Profesor> existingProfesor = profesores.stream()
                .filter(profesor -> profesor.getId().equals(id))
                .findFirst();

        existingProfesor.ifPresent(profesor -> {
            profesor.setFullName(updatedProfesor.getFullName());
            profesor.setPhone(updatedProfesor.getPhone());
            profesor.setEmail(updatedProfesor.getEmail());
            profesor.setAddress(updatedProfesor.getAddress());
            profesor.setGender(updatedProfesor.getGender());
            profesor.setSalary(updatedProfesor.getSalary());
            profesor.setDependency(updatedProfesor.getDependency());
            profesor.setSubject(updatedProfesor.getSubject());
        });

        return existingProfesor.orElse(null);
    }

    @Override
    public void delete(String id) {
        profesores.removeIf(profesor -> profesor.getId().equals(id));
    }
}
