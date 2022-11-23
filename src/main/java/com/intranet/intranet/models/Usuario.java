package com.intranet.intranet.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;

	private String apellidoPaterno;

	private String apellidoMaterno;

	private String nombres;

	private String correo;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaIngreso;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;

	private String foto;

	private String password;

	private Long status;

	private String telefono;

	private String username;

	public Usuario() {
	}

	public Usuario(Long id_usuario, String apellidoPaterno, String apellidoMaterno, String nombres, String correo,
			Date fechaIngreso, Date fechaNacimiento, String foto, String password, Long status, String telefono,
			String username) {
		this.id_usuario = id_usuario;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombres = nombres;
		this.correo = correo;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.foto = foto;
		this.password = password;
		this.status = status;
		this.telefono = telefono;
		this.username = username;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    
}
