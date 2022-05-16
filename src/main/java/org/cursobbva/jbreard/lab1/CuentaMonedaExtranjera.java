package org.cursobbva.jbreard.lab1;

import java.util.Set;

public class CuentaMonedaExtranjera extends Cuenta {
	private Set<Moneda>  monedas;

	public Set<Moneda> getMonedas() {
		return monedas;
	}

	public void setMonedas(Moneda monedas) {
		this.monedas.add(monedas);
	}

}
