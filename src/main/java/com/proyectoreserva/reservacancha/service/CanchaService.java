package com.proyectoreserva.reservacancha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoreserva.reservacancha.model.Cancha;
import com.proyectoreserva.reservacancha.repository.CanchaRepository;

@Service
public class CanchaService {

    @Autowired
    private CanchaRepository canchaRepository;

    public List<Cancha> listarCanchas() {
        return canchaRepository.findAll();
    }

    public Cancha obtenerCanchaPorId(Long id) {
        Optional<Cancha> cancha = canchaRepository.findById(id);
        return cancha.orElse(null);
    }

    public Cancha guardarCancha(Cancha cancha) {
        return canchaRepository.save(cancha);
    }
    
}
