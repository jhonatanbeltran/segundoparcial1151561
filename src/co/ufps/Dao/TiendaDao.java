package co.ufps.Dao;

import co.ufps.model.Tienda;
import co.ufps.util.Conexion;

public class TiendaDao  extends Conexion<Tienda>implements GenericDao<Tienda>{
	
	public TiendaDao() {
		super(Tienda.class);
		
	}
	
	
	

}
