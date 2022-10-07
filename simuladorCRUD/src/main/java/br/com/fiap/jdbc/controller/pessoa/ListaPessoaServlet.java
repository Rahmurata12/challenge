package br.com.fiap.jdbc.controller.pessoa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.dao.PessoaDAO;
import br.com.fiap.jdbc.model.Pessoa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/listaPessoa")
public class ListaPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PessoaDAO pessoaDAO = new PessoaDAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("listaPessoa.jsp");
	}
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas = pessoaDAO.listarTodos();

		request.setAttribute("pessoas", pessoas);
		RequestDispatcher rd = request.getRequestDispatcher("/listaPessoa.jsp");
		rd.forward(request, response);
	}
}