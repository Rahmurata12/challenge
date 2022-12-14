package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Compra;


public class CompraDAO {
	
	private Connection connection;

	public CompraDAO() {
		this.connection = new ConnectionFactory().conectarOracle();
	}
	
	public List<Compra> listarTodos(int cd_pessoa) {
		List<Compra> compras = new ArrayList<Compra>();
		try {
			String sql = "select * from compra where CD_PESSOA = ?";

			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cd_pessoa);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Compra compra = new Compra();
				compra.setDate_compra(rs.getDate(2));
				compra.setStatus(rs.getString(3));
				compra.setLocal_compra(rs.getString(4));
				compra.setCd_pessoa(rs.getInt(5));
				compras.add(compra);
			}
			stmt.close();
			rs.close();
			return compras;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void salvar(Compra compra) {
		try {
			System.out.println("teste");
			String sql = "insert into compra (DATA_COMPRA,STATUS,LOCAL_COMPRA,CD_PESSOA) values(?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setDate(1, compra.getDate_compra());
			stmt.setString(2, compra.getStatus());
			stmt.setString(3, compra.getLocal_compra());
			stmt.setInt(4, compra.getCd_pessoa());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
