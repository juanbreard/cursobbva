package org.cursobbva.jbreard.lab1.src;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MovimientoTransferenciaRealizada extends Movimiento {
	
	@ManyToOne
	private Cuenta cuentaDestino;

	public Cuenta getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(Cuenta cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

}
