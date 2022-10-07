package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Pessoa;

public class PessoaDAO {

	private Connection connection;

	public PessoaDAO() {
		this.connection = new ConnectionFactory().conectarOracle();
	}

	public void salvarComGenero(Pessoa pessoa) {
		try {
			String sql = "INSERT INTO PESSOA (nome, rg, cpf, email, data_nascimento, GENERO_CD_GENERO) VALUES (?,?,?,?,?,?)";

			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getRG());
			stmt.setString(3, pessoa.getCPF());
			stmt.setString(4, pessoa.getEMAIL());
			stmt.setDate(5, pessoa.getData_nascimento());
			stmt.setInt(6, pessoa.getCd_genero());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public List<Pessoa> listarTodos() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		try {
			String sql = "SELECT * FROM PESSOA ORDER BY CD_PESSOA ASC";

			PreparedStatement stmt = connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setCd_pessoa(rs.getInt(1));
				pessoa.setNome(rs.getString(2));
				pessoa.setRG(rs.getString(3));
				pessoa.setCPF(rs.getString(4));
				pessoa.setEMAIL(rs.getString(5));
				pessoa.setData_nascimento(rs.getDate(6));
				pessoa.setCd_genero(rs.getInt(7));
				pessoas.add(pessoa);
			}
			stmt.close();
			rs.close();
			return pessoas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Pessoa buscaCd_pessoa(int Cd_pessoa) {
		try {

			String sql = "SELECT CD_PESSOA, NOME, RG, CPF, EMAIL, DATA_NASCIMENTO, GENERO_CD_GENERO FROM PESSOA WHERE CD_PESSOA = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, Cd_pessoa);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setCd_pessoa(rs.getInt(1));
				pessoa.setNome(rs.getString(2));
				pessoa.setRG(rs.getString(3));
				pessoa.setCPF(rs.getString(4));
				pessoa.setEMAIL(rs.getString(5));
				pessoa.setData_nascimento(rs.getDate(6));
				pessoa.setCd_genero(rs.getInt(7));
				return pessoa;
			}
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public void alterar(String nome, String rg, String cpf, String email, Date data_nascimento, int cd_genero,
			int cd_pessoa) {
		try {
			PreparedStatement stmt = connection.prepareStatement(
					"UPDATE PESSOA P SET P.nome = ?, P.rg = ?, P.cpf = ? , P.email = ? ,P.data_nascimento = ?, P.GENERO_CD_GENERO= ? WHERE CD_PESSOA = ?");
			stmt.setString(1, nome);
			stmt.setString(2, rg);
			stmt.setString(3, cpf);
			stmt.setString(4, email);
			stmt.setDate(5, data_nascimento);
			stmt.setInt(6, cd_genero);
			stmt.setInt(7, cd_pessoa);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void excluir(int Cd_pessoa) {
		try {
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM PESSOA WHERE CD_PESSOA = ?");
			stmt.setInt(1, Cd_pessoa);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
