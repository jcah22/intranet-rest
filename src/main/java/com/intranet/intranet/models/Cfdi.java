package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cfdis")
public class Cfdi {

    @Id
	@GeneratedValue
	private Long id_cfdi;

	private String codigo;

	private String nombre;

	public Cfdi() {
	}

	public Cfdi(Long id_cfdi, String codigo, String nombre) {
		this.id_cfdi = id_cfdi;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Long getId_cfdi() {
		return id_cfdi;
	}

	public void setId_cfdi(Long id_cfdi) {
		this.id_cfdi = id_cfdi;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	

	



    
    
}
