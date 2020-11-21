package co.ufps.Dao;

import co.ufps.model.Cliente;
import co.ufps.util.Conexion;

public class ClienteDao  extends Conexion<Cliente>implements GenericDao<Cliente>{
	
	public ClienteDao() {
		super(Cliente.class);
		
	}
	
	
	

}

