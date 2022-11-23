package com.intranet.intranet.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "odcs")
public class Odc {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_odc;

	
	private Long codigo;

	private String descripcion;

	private String factura;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecha;

	private String flete;

	private Double total;

	public Odc() {
	}

	public Odc(Long id_odc, Long codigo, String descripcion, String factura, Date fecha, String flete, Double total) {
		this.id_odc = id_odc;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.factura = factura;
		this.fecha = fecha;
		this.flete = flete;
		this.total = total;
	}

	public Long getId_odc() {
		return id_odc;
	}

	public void setId_odc(Long id_odc) {
		this.id_odc = id_odc;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFactura() {
		return factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getFlete() {
		return flete;
	}

	public void setFlete(String flete) {
		this.flete = flete;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	

	

	

    


    
}
