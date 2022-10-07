package teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.dao.GeneroDAO;
import br.com.fiap.jdbc.model.Genero;

public class teste {

	public static void main(String[] args) {

		GeneroDAO generoDAO = new GeneroDAO();
		
		List<Genero> generos = new ArrayList<Genero>();
		generos = generoDAO.listarComGenero();
		for (Genero genero : generos) {
			System.out.println(genero.getGenero());
		}
		/*
		 * Produto produto1 = new Produto(); produto1.setNome("teste");
		 * produto1.setDescricao("teste"); produto1.setSKU("teste");
		 * produto1.setPreco(11); produto1.setCaracteristica("teste");
		 * produto1.setIdCategoria(1); ProdutoDAO.salvarComCategoria(produto1);
		 */

		/*
		 * Produto Produto = new Produto(); Produto = ProdutoDAO.buscaProdutoID(1);
		 * System.out.println(Produto.getNome());
		 * System.out.println(Produto.getDescricao());
		 * System.out.println(Produto.getSKU()); System.out.println(Produto.getPreco());
		 * System.out.println(Produto.getCaracteristica());
		 * System.out.println(Produto.getIdCategoria());
		 */
	}
}
