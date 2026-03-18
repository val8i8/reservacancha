package com.proyectoreserva.reservacancha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.proyectoreserva.reservacancha.model.Cancha;
import com.proyectoreserva.reservacancha.service.CanchaService;

@RestController
@RequestMapping("/canchas")
public class CanchaController {

    @Autowired
    private CanchaService canchaService;

    @GetMapping
    public List<Cancha> listarCanchas() {
        return canchaService.listarCanchas();
    }

    @GetMapping("/{id}")
    public Cancha obtenerCanchaPorId(@PathVariable Long id) {
        return canchaService.obtenerCanchaPorId(id);
    }

    @PostMapping
    public Cancha crearCancha(@RequestBody Cancha cancha) {
        return canchaService.guardarCancha(cancha);
    }
}