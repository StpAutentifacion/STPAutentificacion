package com.mario.cortes.model;

import java.time.LocalDate;

//JavaBean ó Pojo
public class Producto {
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private Double precio;
	private Integer existencias;
	private LocalDate fechaProduccion;
	private String imagen;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getExistencias() {
		return existencias;
	}
	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}
	public LocalDate getFechaProduccion() {
		return fechaProduccion;
	}
	public void setFechaProduccion(LocalDate fechaProduccion) {
		this.fechaProduccion = fechaProduccion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", existencias=" + existencias + ", fechaProduccion=" + fechaProduccion + ", imagen=" + imagen + "]";
	}
	
	

}
