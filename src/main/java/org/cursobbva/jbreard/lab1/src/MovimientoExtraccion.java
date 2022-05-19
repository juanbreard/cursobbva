package org.cursobbva.jbreard.lab1.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovimientoExtraccion extends Movimiento {
	

	private String lugar;

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

}
