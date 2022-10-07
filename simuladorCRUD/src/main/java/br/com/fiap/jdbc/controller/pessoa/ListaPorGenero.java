package br.com.fiap.jdbc.controller.pessoa;

import java.io.IOException;
import java.util.List;

import br.com.fiap.jdbc.dao.GeneroDAO;
import br.com.fiap.jdbc.model.Genero;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaPorGenero")
public class ListaPorGenero extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private GeneroDAO generoDAO;

    /**
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Genero> lista = this.generoDAO.listarComGenero();
		
		request.setAttribute("generos", lista);
		RequestDispatcher rd = request.getRequestDispatcher("/listaPorGenero.jsp");
		rd.forward(request, response);
	}
}