package org.cursobbva.jbreard.lab1.src;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsaCuentaMonedaNacional {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miniBanco");
		EntityManager em = emf.createEntityManager();
		
	}
}

