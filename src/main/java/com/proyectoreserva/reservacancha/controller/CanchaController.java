package com.proyectoreserva.reservacancha.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoreserva.reservacancha.model.Cancha;

@RestController
@RequestMapping("/canchas")
public class CanchaController {

    private List<Cancha> canchas = new ArrayList<>();

    @GetMapping
    public List<Cancha> listarCanchas() {
        return canchas;
    }

    @GetMapping("/{id}")
    public Cancha obtenerCanchaPorId(@PathVariable Long id) {

        for (Cancha cancha : canchas) {
            if (cancha.getId().equals(id)) {
                return cancha;
            }
        }

        return null;
    }

    @PostMapping
    public Cancha crearCancha(@RequestBody Cancha cancha) {
        cancha.setId((long) canchas.size() + 1);
        canchas.add(cancha);
        return cancha;
    }

}