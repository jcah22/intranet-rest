package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "areas")
public class Area {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_area;

	private String nombre;

	public Area() {
	}

	public Area(Long id_area, String nombre) {
		this.id_area = id_area;
		this.nombre = nombre;
	}

	public Long getId_area() {
		return id_area;
	}

	public void setId_area(Long id_area) {
		this.id_area = id_area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	

	
    
}
