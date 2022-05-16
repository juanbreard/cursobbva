package org.cursobbva.jbreard.lab1;

public enum Moneda {
	DOLAR("Dolar Estadounidense","u$s"), Euro("Euro","E");
	private String nombreMoneda;
	private String simboloMoneda;
	
	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}

	public String getSimboloMoneda() {
		return simboloMoneda;
	}

	public void setSimboloMoneda(String simboloMoneda) {
		this.simboloMoneda = simboloMoneda;
	}

	Moneda(String nombreMoneda, String simboloMoneda) {
		this.nombreMoneda = nombreMoneda;
		this.simboloMoneda = simboloMoneda;
	}
	
	
}
