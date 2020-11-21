package co.ufps.util;

import co.ufps.Dao.ClienteDao;
import co.ufps.Dao.ServicioDao;
import co.ufps.model.Cliente;
import co.ufps.model.Servicio;

public class text {
	static ClienteDao clienteDao = new ClienteDao();
	static ServicioDao servicioDao = new ServicioDao();

	public text() {
		
		// TODO Auto-generated constructor stub
	}
	

	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(); 
		Servicio servicio = new Servicio();
		
		cliente.setNombre("jhonatan andres");
		cliente.setEmail("jhonatanandresbc@ufps.edu.co");
		cliente.setClave("0000");
		
		servicio.setNombre("compra de muebles");
		servicio.setDescripcion("se compran muebles nuevos y usados");
		servicio.setTiendaBean(null);
		
		clienteDao.insert(cliente);
		servicioDao.insert(servicio);
		
		
		
		
	}
	
}
