package com.onesystem.onesystem.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Profesor extends Persona implements Universidad {
    private double salary;
    private String dependency;
    private String subject;

    public Profesor(String fullName,
            String id, String phone, String email, String address, String gender,
            double salary, String dependency, String subject) {
        super(fullName, id, phone, email, address, gender);
        this.salary = salary;
        this.dependency = dependency;
        this.subject = subject;
    }

    @Override
    public void eat() {
        System.out.println(getFullName() + " está comiendo en la sala de profesores.");
    }

    @Override
    public void rest() {
        System.out.println(getFullName() + " está descansando después de la clase.");
    }

    public void qualify(String studentName, double grade) {
        System.out.println(getFullName() + " calificó a " + studentName + " con una nota de " + grade + ".");
    }

    public void prepareClass() {
        System.out.println(getFullName() + " está preparando la clase de " + subject + ".");
    }

    @Override
    public String getSchedule() {
        return getFullName();
    }

    @Override
    public void goToClass() {
        System.out.println(getFullName() + " está dando clase de " + subject + ".");
    }

    @Override
    public String getProgram() {
        return dependency;
    }

    @Override
    public boolean getParkingPass() {
        return true;
    }
}
