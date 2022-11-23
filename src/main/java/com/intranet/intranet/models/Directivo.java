package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "directivos")
public class Directivo {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_directivo;

	private String nombre;

	public Directivo() {
	}

	public Directivo(Long id_directivo, String nombre) {
		this.id_directivo = id_directivo;
		this.nombre = nombre;
	}

	public Long getId_directivo() {
		return id_directivo;
	}

	public void setId_directivo(Long id_directivo) {
		this.id_directivo = id_directivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	

	
    
}
