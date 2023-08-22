package com.sanchez.app.proyecto3.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "clientes")
//Id de tabla clientes referenciada de tabla Persona
@PrimaryKeyJoinColumn(name = "idC")

public class Cliente extends Persona {

    @Column(name = "total_pagar", nullable = false)
	private Float totalPagar;

    @OneToMany(mappedBy = "cliente",
                fetch = FetchType.LAZY,
                cascade = CascadeType.ALL
                )
    private List<Trabajador> trabajadores;

    public Cliente(Long id, String name, String apellidoP, String apellidoM, String telefono, Float totalPagar, Direccion direccion) {
        super(id, name, apellidoP, apellidoM, telefono, direccion);

        this.totalPagar = totalPagar;

    }

    //Getters' y Setter's
    public Float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(List<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
}