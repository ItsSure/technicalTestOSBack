package com.onesystem.onesystem.service;

import java.util.ArrayList;
import java.util.List;

import com.onesystem.onesystem.model.Alumno;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlumnoService implements UniversidadService<Alumno> {
    private final List<Alumno> alumnos = new ArrayList<>();

    @Override
    public List<Alumno> getAll() {
        return alumnos;
    }

    @Override
    public Alumno getById(String id) {
        return alumnos.stream()
                .filter(alumno -> alumno.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Alumno create(Alumno alumno) {
        alumnos.add(alumno);
        return alumno;
    }

    @Override
    public Alumno update(String id, Alumno updatedAlumno) {
        Optional<Alumno> existingAlumno = alumnos.stream()
                .filter(alumno -> alumno.getId().equals(id))
                .findFirst();

        existingAlumno.ifPresent(alumno -> {
            alumno.setFullName(updatedAlumno.getFullName());
            alumno.setPhone(updatedAlumno.getPhone());
            alumno.setEmail(updatedAlumno.getEmail());
            alumno.setAddress(updatedAlumno.getAddress());
            alumno.setGender(updatedAlumno.getGender());
            alumno.setRegistrationNumber(updatedAlumno.getRegistrationNumber());
            alumno.setProgram(updatedAlumno.getProgram());
            alumno.setAverageGrade(updatedAlumno.getAverageGrade());
        });

        return existingAlumno.orElse(null);
    }

    @Override
    public void delete(String id) {
        alumnos.removeIf(alumno -> alumno.getId().equals(id));
    }
}
