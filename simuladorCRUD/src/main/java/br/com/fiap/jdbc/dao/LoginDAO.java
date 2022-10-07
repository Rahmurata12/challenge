package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Login;

public class LoginDAO {
	private Connection connection;

	public LoginDAO() {
		this.connection = new ConnectionFactory().conectarOracle();
	}

	public void salvarComPessoa(Login login) {
		try {
			String sql = "INSERT INTO LOGIN (USUARIO, SENHA, PESSOA_CD_PESSOA) VALUES (?,?,?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, login.getUsuario());
			stmt.setString(2, login.getSenha());
			stmt.setInt(3, login.getCd_pessoa());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Login> listarTodos() {
		List<Login> logins = new ArrayList<Login>();
		try {
			String sql = "SELECT * FROM Login ORDER BY PESSOA_CD_PESSOA ASC";

			PreparedStatement stmt = connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Login login = new Login();
				login.setUsuario(rs.getString(1));
				login.setSenha(rs.getString(2));
				login.setCd_pessoa(rs.getInt(3));
				logins.add(login);
			}
			stmt.close();
			rs.close();
			return logins;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Login buscaCd_pessoa(int Cd_pessoa) {
		try {

			String sql = "SELECT USUARIO, SENHA, CD_LOGIN, PESSOA_CD_PESSOA FROM LOGIN WHERE PESSOA_CD_PESSOA = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, Cd_pessoa);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Login login = new Login();
				login.setUsuario(rs.getString(1));
				login.setSenha(rs.getString(2));
				login.setCd_login(rs.getInt(3));
				login.setCd_pessoa(rs.getInt(4));
				return login;
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public void alterar(String usuario, String senha, int cd_pessoa) {
		try {
			PreparedStatement stmt = connection.prepareStatement(
					"UPDATE LOGIN L SET L.USUARIO = ?, L.SENHA = ? WHERE PESSOA_CD_PESSOA = ?");
			stmt.setString(1, usuario);
			stmt.setString(2, senha);
			stmt.setInt(3, cd_pessoa);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void excluir(int Cd_pessoa) {
		try {
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM LOGIN WHERE PESSOA_CD_PESSOA = ?");
			stmt.setInt(1, Cd_pessoa);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
