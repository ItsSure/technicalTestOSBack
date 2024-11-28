package com.onesystem.onesystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Persona {
    private String fullName;
    private String id;
    private String phone;
    private String email;
    private String address;
    private String gender;

    public abstract void eat();

    public abstract void rest();
}
