package com.sanchez.app.proyecto3.Dto;

import com.sanchez.app.proyecto3.models.Persona;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class DireccionCreateDto {

    private Long idD;
    private String calle;
    private String numero;
    private String colonia;
    private String ciudad;
    private String estado;
    private String cp;

    private Integer persona;
}
