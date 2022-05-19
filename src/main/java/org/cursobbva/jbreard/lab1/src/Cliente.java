package org.cursobbva.jbreard.lab1.src;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Cliente {
	@Id
	private Long Id;
	@ElementCollection
	private Set<Cuenta> cuentasSoyTitular;
	@ElementCollection
	private Set<Cuenta> cuentasSoyCoTitular;
	private String nombre;
	private String apellido;
	@ManyToOne
	private Direccion direccion;
	private String telefono;
	private String email;
	
	public Set<Cuenta> getCuentasSoyTitular() {
		return cuentasSoyTitular;
	}
	public void setCuentasSoyTitular(Cuenta cuentasSoyTitular) {
		this.cuentasSoyTitular.add(cuentasSoyTitular);
	}
	public Set<Cuenta>  getCuentasSoyCoTitular() {
		return cuentasSoyCoTitular;
	}
	public void setCuentasSoyCoTitular(Cuenta cuentasSoyCoTitular) {
		this.cuentasSoyCoTitular.add(cuentasSoyCoTitular);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
