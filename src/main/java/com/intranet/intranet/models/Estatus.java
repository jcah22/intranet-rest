package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estatus")
public class Estatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_status;

	private String nombre;

	public Estatus() {
	}

	public Estatus(Long id_status, String nombre) {
		this.id_status = id_status;
		this.nombre = nombre;
	}

	public Long getId_status() {
		return id_status;
	}

	public void setId_status(Long id_status) {
		this.id_status = id_status;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
