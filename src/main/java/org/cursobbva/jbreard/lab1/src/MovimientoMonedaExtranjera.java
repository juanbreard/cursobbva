package org.cursobbva.jbreard.lab1.src;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovimientoMonedaExtranjera extends Movimiento {

	private Long contizacion;
	private Long comision;
	public Long getContizacion() {
		return contizacion;
	}
	public void setContizacion(Long contizacion) {
		this.contizacion = contizacion;
	}
	public Long getComision() {
		return comision;
	}
	public void setComision(Long comision) {
		this.comision = comision;
	}
}
