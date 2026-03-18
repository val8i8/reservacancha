package com.proyectoreserva.reservacancha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyectoreserva.reservacancha.model.Cancha;

public interface CanchaRepository extends JpaRepository<Cancha, Long> {
    
}
