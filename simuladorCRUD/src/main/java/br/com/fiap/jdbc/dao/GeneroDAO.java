package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Genero;
import br.com.fiap.jdbc.model.Pessoa;


public class GeneroDAO {

	private Connection connection;

	public GeneroDAO() {
		this.connection = new ConnectionFactory().conectarOracle();
	}
	
	public List<Genero> listar() throws SQLException {

		List<Genero> categorias = new ArrayList<Genero>();
		String sql = "select * from GENERO";
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			Genero genero = new Genero();
			genero.setCd_genero(rs.getInt(1));
			genero.setGenero(rs.getString(2));
			categorias.add(genero);
		}
		rs.close();
		stmt.close();
		return categorias;
	}

	public List<Genero> listarComGenero() {
		try {
			Genero generoAtual = null;
			List<Genero> generos = new ArrayList<Genero>();

			String sql = "SELECT G.CD_GENERO, G.GENERO, P.CD_PESSOA, P.NOME, P.RG, P.CPF, P.DATA_NASCIMENTO, P.GENERO_CD_GENERO FROM GENERO G INNER JOIN PESSOA P ON G.CD_GENERO = P.GENERO_CD_GENERO order by G.CD_GENERO";

			try (PreparedStatement stmt = connection.prepareStatement(sql)) {
				stmt.execute();
				ResultSet rs = stmt.getResultSet();
				while (rs.next()) {
					if (generoAtual == null || !generoAtual.getGenero().equals(rs.getString(2))) {
						Genero genero = new Genero();
						genero.setCd_genero(rs.getInt(1));
						genero.setGenero(rs.getString(2));
						generos.add(genero);
						generoAtual = genero;
					}
					Pessoa pessoa = new Pessoa();
					pessoa.setCd_pessoa(rs.getInt(3));
					pessoa.setNome(rs.getString(4));
					pessoa.setRG(rs.getString(5));
					pessoa.setCPF(rs.getString(6));
					pessoa.setData_nascimento(rs.getDate(7));
					pessoa.setCd_genero(rs.getInt(8));
					

					generoAtual.adicionarPessoa(pessoa);
				}
				rs.close();
				stmt.close();
				return generos;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
