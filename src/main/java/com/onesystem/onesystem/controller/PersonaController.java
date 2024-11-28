package com.onesystem.onesystem.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    @PostMapping("/{id}/comer")
    public String comer(@PathVariable String id) {
        return "La persona con ID " + id + " está comiendo.";
    }

    @PostMapping("/{id}/descansar")
    public String descansar(@PathVariable String id) {
        return "La persona con ID " + id + " está descansando.";
    }
}
