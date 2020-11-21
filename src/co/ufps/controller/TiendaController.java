package co.ufps.controller;

import java.io.IOException;	
import java.util.List;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.ufps.Dao.TiendaDao;
import co.ufps.model.Tienda;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/Tienda")
public class TiendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TiendaDao tiendaDao= new TiendaDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiendaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = request.getServletPath();
		String action = request.getParameter("action");
		System.out.println(action);
			switch(action) {
			case "new":
				showNewForm(request, response);
				break;
			case "insert":
				insertarTienda(request, response);
				break;
			case "listar":
				listTienda(request, response);
				break;
			default:
				index(request,response);	
					
			}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private void listTienda(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void insertarTienda(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Tienda tienda = new Tienda();
		tienda.setNombre(request.getParameter("inputNombre"));
		tienda.setLema(request.getParameter("inputLema"));
		tienda.setDescripcion(request.getParameter("inputDescripcion"));
		tienda.setEmail(request.getParameter("inputEmail"));
		tienda.setClave(request.getParameter("inputPassword"));
		tienda.setPropietario(request.getParameter("inputPropietario"));
		tienda.setFacebook(request.getParameter("inputFacebook"));
		tienda.setWeb(request.getParameter("inputWeb"));
		tienda.setImagen(request.getParameter("inputImagen"));
		tiendaDao.insert(tienda);
		List <Tienda> listaTiendas = tiendaDao.list();
		request.getSession().setAttribute("listaHeroes", listaTiendas);	
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
		
		
	}

	private void index(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}


	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("registro.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
