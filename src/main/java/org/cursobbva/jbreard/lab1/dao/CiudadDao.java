/**
 * @author juan Ramon
 *
 */
package org.cursobbva.jbreard.lab1.dao;

import java.util.List;



import javax.persistence.EntityManager;


import org.cursobbva.jbreard.lab1.src.Ciudad;


public class CiudadDao implements Dao<Ciudad> {
	
	private EntityManager entityManager;
    


    
    @Override
    public List<Ciudad> getAll() {
		return null;

    }




	@Override
	public void save(Ciudad t) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void update(Ciudad t, String[] params) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void delete(Ciudad t) {
		// TODO Auto-generated method stub
		
	}
    


}
