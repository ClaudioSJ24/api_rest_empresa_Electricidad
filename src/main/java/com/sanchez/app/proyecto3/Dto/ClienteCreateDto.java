package com.sanchez.app.proyecto3.Dto;

public class ClienteCreateDto extends PersonaCreateDto{

    private Float totalPagar;
    private Integer trabajador;

    public ClienteCreateDto(Long idP, String nombre, String apellidoP, String apellidoM, String telefono, Integer direccion_id, Float totalPagar, Integer trabajador) {
        super(idP, nombre, apellidoP, apellidoM, telefono, direccion_id);

        this.totalPagar = totalPagar;
        this.trabajador = trabajador;

    }

    public Float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Integer getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Integer trabajador) {
        this.trabajador = trabajador;
    }
}
