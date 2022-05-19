package org.cursobbva.jbreard.lab1.src;

import javax.persistence.Entity;

@Entity
public class MovimientoDeposito extends Movimiento {
	private String lugar;

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
}
