package com.sanchez.app.proyecto3.models;


import jakarta.persistence.*;

@Entity
@Table(name = "direcciones")
public class Direccion {

    //Atributos
    @Id
    @Column(name = "id_direccion", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ2")
    @SequenceGenerator(sequenceName = "CUST_SEQ2", allocationSize = 1, name = "CUST_SEQ")
    private Long idD;
    @Column(name = "calle", nullable = false)
    private String calle;
    @Column(name = "numero", nullable = false)
    private String numero;
    @Column(name = "colonia", nullable = false)
    private String colonia;
    @Column(name = "ciudad", nullable = false)
    private String ciudad;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "codigo_postal", nullable = false)
    private String cp;
    @OneToOne()
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    public Direccion(Long idD, String calle, String numero, String colonia, String ciudad, String estado, String cp) {
        this.idD = idD;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
        this.cp = cp;
    }

    public Long getIdDireccion() {
        return idD;
    }

    public void setIdD(Long id_direccion) {
        this.idD = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
}
