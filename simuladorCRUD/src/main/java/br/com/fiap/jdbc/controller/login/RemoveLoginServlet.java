package br.com.fiap.jdbc.controller.login;

import java.io.IOException;

import br.com.fiap.jdbc.dao.LoginDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/removerLogin")
public class RemoveLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginDAO logindDAO = new LoginDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int cd_pessoa = Integer.parseInt(request.getParameter("cd_pessoa"));
		
		this.logindDAO.excluir(cd_pessoa);
		
		response.sendRedirect("listaLogin");

	}

}

