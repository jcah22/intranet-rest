package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reqs")
public class Req {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_req;

	private String codigo;

	private String nombre;

	public Req() {
	}

	public Req(Long id_req, String codigo, String nombre) {
		this.id_req = id_req;
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Long getId_req() {
		return id_req;
	}

	public void setId_req(Long id_req) {
		this.id_req = id_req;
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
