package com.sanchez.app.proyecto3.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


import jakarta.persistence.*;

import java.util.List;


//Establece herencia a clases cliente y trabajador

@Inheritance(strategy = InheritanceType.JOINED)

//Al ser una clase abstracta es necesario establecer el nombre de la clase referenciada 
//mediante la propiedad class

@JsonTypeInfo(
		
			use = JsonTypeInfo.Id.NAME,
			include = JsonTypeInfo.As.PROPERTY,
			property = "class"
		)


//Se determina el nombre de las clases que heredaran de esta clase para su referencia mediante la propiedad name

@JsonSubTypes({
	@JsonSubTypes.Type(value = Cliente.class, name = "cliente"),
	@JsonSubTypes.Type(value = Trabajador.class, name = "trabajador")
})

@Entity
@Table(name = "personas")
public abstract class Persona {
	
	//Atributos
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ1")
	@SequenceGenerator(sequenceName = "CUST_SEQ1", allocationSize = 1, name = "CUST_SEQ1")
	private Long idP;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "apellido_p", nullable = false)
	private String apellidoP;

	@Column(name = "apellido_m", nullable = false)
	private String apellidoM;

	@Column(name = "telefono", nullable = false)
	private String telefono;

	@OneToOne(mappedBy = "persona",
			fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Direccion direccion;
	
	//Constructor con argumentos
	public Persona(Long id, String nombre, String apellidoP, String apellidoM, String telefono, Direccion direccion) {

		this.idP = id;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.telefono = telefono;
		this.direccion = direccion;

    }
    //Getter´s y Setter´s
	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
