package org.cursobbva.jbreard.lab1.src;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
@Entity
public class CuentaMonedaExtranjera extends Cuenta {
	@ElementCollection
	private Set<Moneda>  monedas;

	public Set<Moneda> getMonedas() {
		return monedas;
	}

	public void setMonedas(Moneda monedas) {
		this.monedas.add(monedas);
	}

}
