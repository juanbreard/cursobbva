package org.cursobbva.jbreard.lab1.src;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MovimientoTransferenciaRecibida extends Movimiento {
	@ManyToOne
	private Cuenta cuentaOrigen;

	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

}
