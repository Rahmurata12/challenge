package br.com.fiap.jdbc.controller.pessoa;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.fiap.jdbc.dao.PessoaDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/alterarPessoa")
public class AlteraPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PessoaDAO pessoaDAO = new PessoaDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("formAlteraPessoa.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomePessoa = request.getParameter("nome");
		String rgPessoa = request.getParameter("rg");
		String cpfPessoa = request.getParameter("cpf");
		String emailPessoa = request.getParameter("email");
		String dataNascPessoaStr = request.getParameter("dataNasc");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			java.util.Date udom = sdf.parse(dataNascPessoaStr);
			long ms1 = udom.getTime();
			java.sql.Date sqdom = new java.sql.Date(ms1);
			int cd_generoPessoa = Integer.parseInt(request.getParameter("cd_generoPessoa"));
			this.pessoaDAO.alterar(nomePessoa, rgPessoa, cpfPessoa, emailPessoa, sqdom, cd_generoPessoa, cd_generoPessoa);
			response.sendRedirect("listaPessoa");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
