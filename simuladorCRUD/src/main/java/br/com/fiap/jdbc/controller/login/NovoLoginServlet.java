package br.com.fiap.jdbc.controller.login;

import java.io.IOException;

import br.com.fiap.jdbc.dao.LoginDAO;
import br.com.fiap.jdbc.model.Login;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/novoLogin")
public class NovoLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginDAO loginDAO = new LoginDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("formNovoLogin.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String usuarioLogin = request.getParameter("usuario");
		String rgPessoa = request.getParameter("senha");
		int cdPessoa = Integer.parseInt(request.getParameter("cd_pessoa"));

		Login login = new Login(usuarioLogin, rgPessoa, cdPessoa);
		this.loginDAO.salvarComPessoa(login);;
		response.sendRedirect("listaLogin");

	}
}