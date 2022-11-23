package com.intranet.intranet.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empresa;

	private String correo;

	private String direccion;

	private String imagen;

	private String nombre;

	private String rfc;

	private String telefono;

	public Empresa() {
	}

	public Empresa(Long id_empresa, String correo, String direccion, String imagen, String nombre, String rfc,
			String telefono) {
		this.id_empresa = id_empresa;
		this.correo = correo;
		this.direccion = direccion;
		this.imagen = imagen;
		this.nombre = nombre;
		this.rfc = rfc;
		this.telefono = telefono;
	}

	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	

	
    
}
