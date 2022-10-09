package teste;

import java.text.SimpleDateFormat;

import br.com.fiap.jdbc.dao.CompraDAO;
import br.com.fiap.jdbc.model.Compra;

public class teste {

	public static void main(String[] args) {
		
		CompraDAO compraDAO = new CompraDAO();
		Compra compra1 = new Compra();
		
		String data = ("01/19/2022");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			java.util.Date udom = sdf.parse(data);
			long ms1 = udom.getTime();
			java.sql.Date sqdom = new java.sql.Date(ms1);

			compra1.setDate_compra(sqdom);
			compra1.setStatus("APROVADO");
			compra1.setLocal_compra("Burger King");
			compra1.setCd_pessoa(102);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		compraDAO.salvar(compra1);
	}
}
