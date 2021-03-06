package org.cursobbva.jbreard.lab1.src;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public abstract class Movimiento {
	@Id
	private Long id;
	private LocalDate fecha;
	private LocalTime hora;
	private Long monto;
	private String descripcion;
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public Long getMonto() {
		return monto;
	}
	public void setMonto(Long monto) {
		this.monto = monto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
