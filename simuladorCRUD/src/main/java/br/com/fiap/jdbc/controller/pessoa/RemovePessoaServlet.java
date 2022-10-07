package br.com.fiap.jdbc.controller.pessoa;

import java.io.IOException;

import br.com.fiap.jdbc.dao.PessoaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/removerPessoa")
public class RemovePessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PessoaDAO pessoaDAO = new PessoaDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int cd_pessoa = Integer.parseInt(request.getParameter("cd_pessoa"));
		
		this.pessoaDAO.excluir(cd_pessoa);
		
		response.sendRedirect("listaPessoa");

	}

}
