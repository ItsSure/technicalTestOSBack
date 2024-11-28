package com.onesystem.onesystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Alumno extends Persona implements Universidad {
    private String registrationNumber;
    private String program;
    private Float averageGrade;

    public Alumno(String fullName,
            String id, String phone, String email, String address, String gender,
            String registrationNumber, String program, Float averageGrade) {
        super(fullName, id, phone, email, address, gender);
        this.registrationNumber = registrationNumber;
        this.program = program;
        this.averageGrade = averageGrade;
    }

    @Override
    public void eat() {
        System.out.println(getFullName() + " está comiendo.");
    }

    @Override
    public void rest() {
        System.out.println(getFullName() + " está descansando.");
    }

    public void study() {
        System.out.println(getFullName() + " está estudiando en el programa " + program + ".");
    }

    @Override
    public String getSchedule() {
        return getFullName();
    }

    @Override
    public void goToClass() {
        System.out.println(getFullName() + " está asistiendo a clase de " + program + ".");
    }

    @Override
    public String getProgram() {
        return program;
    }

    @Override
    public boolean getParkingPass() {
        return false;
    }
}
