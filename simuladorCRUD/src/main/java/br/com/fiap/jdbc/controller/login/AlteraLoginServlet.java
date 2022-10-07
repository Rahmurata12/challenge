package br.com.fiap.jdbc.controller.login;

import java.io.IOException;

import br.com.fiap.jdbc.dao.LoginDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/alterarLogin")
public class AlteraLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginDAO loginDAO = new LoginDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("formAlteraLogin.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuarioLogin = request.getParameter("usuario");
		String senhaLogin = request.getParameter("senha");
		int cdLogin = Integer.parseInt(request.getParameter("cd_login"));
		
		this.loginDAO.alterar(usuarioLogin, senhaLogin,cdLogin );
	}

}
