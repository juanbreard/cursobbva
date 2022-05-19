package org.cursobbva.jbreard.lab1.src;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Provincia {
	@Id
	private Long id;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
