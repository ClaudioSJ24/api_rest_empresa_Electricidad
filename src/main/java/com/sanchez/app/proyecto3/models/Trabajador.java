package com.sanchez.app.proyecto3.models;

import jakarta.persistence.*;

@Entity
@Table(name = "trabajadores")
@PrimaryKeyJoinColumn(name = "idT")
public class Trabajador extends Persona {
     @Column(name = "sueldo", nullable = false)
    private Float sueldo;

     @ManyToOne
     @JoinColumn(name = "cliente_id")
     private Cliente cliente;

    @OneToOne(mappedBy = "trabajador",cascade = CascadeType.ALL)
    private AccesorioElectricidad accesorioElectricidad;

    //Constructor con argumentos

    public Trabajador(Long id, String name, String apellidoP, String apellidoM, String telefono,  Float sueldo, Direccion direccion) {
        super(id, name, apellidoP, apellidoM, telefono, direccion);

        this.sueldo = sueldo;

    }




    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public AccesorioElectricidad getAccesorioElectricidad() {
        return accesorioElectricidad;
    }

    public void setAccesorioElectricidad(AccesorioElectricidad accesorioElectricidad) {
        this.accesorioElectricidad = accesorioElectricidad;
    }
}
