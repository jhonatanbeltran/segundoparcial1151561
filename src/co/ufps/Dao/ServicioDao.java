package co.ufps.Dao;

import co.ufps.model.Servicio;
import co.ufps.util.Conexion;

public class ServicioDao  extends Conexion<Servicio>implements GenericDao<Servicio>{
	
	public ServicioDao() {
		super(Servicio.class);
		
	}
	
	
	

}

