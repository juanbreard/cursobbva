package org.cursobbva.jbreard.lab1.src;

import java.time.LocalDate;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public abstract class Cuenta {
	@Id
	private Long nro;
	private LocalDate fechaCreacion;
	private Long saldoInicial;
	private Long  saldoActual;
	private Long descubierto;
	private LocalDate fechaCierre;
	@ManyToOne
	private Cliente titular;
	@ElementCollection
	private Set<Cliente> clienteCotitulares;
	@ElementCollection
	private Set<Movimiento> movimientos;
	public Long getNro() {
		return nro;
	}
	public void setNro(Long nro) {
		this.nro = nro;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Long getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(Long saldoInicial) {
		this.saldoInicial = saldoInicial;
	}
	public Long getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(Long saldoActual) {
		this.saldoActual = saldoActual;
	}
	public Long getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(Long descubierto) {
		this.descubierto = descubierto;
	}
	public LocalDate getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(LocalDate fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	public Set<Cliente> getClienteCotitulares() {
		return clienteCotitulares;
	}
	public void setClienteCotitulares(Cliente cliente) {
		this.clienteCotitulares.add(cliente) ;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Set<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(Movimiento movimientos) {
		this.movimientos.add(movimientos);
	}
	
}
