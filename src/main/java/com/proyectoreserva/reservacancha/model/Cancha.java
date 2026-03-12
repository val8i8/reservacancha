package com.proyectoreserva.reservacancha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cancha {
    private Long id;
    private String nombre;
    private String tipo;
    private int precioPorHora;
    private Boolean estado;

}