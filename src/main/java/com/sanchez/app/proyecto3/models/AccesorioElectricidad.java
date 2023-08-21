package com.sanchez.app.proyecto3.models;

import com.sanchez.app.proyecto3.models.Enums.TiposCables;
import jakarta.persistence.*;

@Entity
@Table(name = "accesorios_electricidad")

public class AccesorioElectricidad {

    //Atributos
    @Id
    @Column(name = "id_accesorios", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ3")
    @SequenceGenerator(sequenceName = "CUST_SEQ3", allocationSize = 1, name = "CUST_SEQ3")
    private Long idA;

    @Column(name = "tipo_cable", nullable = false)
    @Enumerated(EnumType.STRING)
    private TiposCables calibre;
    @Column(name = "cajas_cable")
    private Integer cajasCable;
    @Column(name = "apagadores", nullable = false)
    private Integer apagadores;
    @Column(name = "contatos", nullable = false)
    private Integer contactos;
    @Column(name = "lamparas",nullable = false)
    private Integer lamparas;
    @Column(name = "total_compra", nullable = false)
    private Float totalCompra;
    @OneToOne()
    @JoinColumn(name = "trabajador_id", nullable = false)
    private Trabajador trabajador;


    public AccesorioElectricidad(Long idA, TiposCables calibre, Integer cajasCable, Integer apagadores, Integer contactos, Integer lamparas, Float totalCompra) {
        this.idA = idA;
        this.calibre = calibre;
        this.cajasCable = cajasCable;
        this.apagadores = apagadores;
        this.contactos = contactos;
        this.lamparas = lamparas;
        this.totalCompra = totalCompra;
    }

    //Getter's and Setter's

    public Long getIdA() {
        return idA;
    }

    public void setIdA(Long idA) {
        this.idA = idA;
    }

    public TiposCables getCalibre() {
        return calibre;
    }

    public void setCalibre(TiposCables calibre) {
        this.calibre = calibre;
    }

    public Integer getCajasCable() {
        return cajasCable;
    }

    public void setCajasCable(Integer cajasCable) {
        this.cajasCable = cajasCable;
    }

    public Integer getApagadores() {
        return apagadores;
    }

    public void setApagadores(Integer apagadores) {
        this.apagadores = apagadores;
    }

    public Integer getContactos() {
        return contactos;
    }

    public void setContactos(Integer contactos) {
        this.contactos = contactos;
    }

    public Integer getLamparas() {
        return lamparas;
    }

    public void setLamparas(Integer lamparas) {
        this.lamparas = lamparas;
    }

    public Float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(Float totalCompra) {
        this.totalCompra = totalCompra;
    }


}
