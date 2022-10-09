package teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.dao.CompraDAO;
import br.com.fiap.jdbc.dao.PessoaDAO;
import br.com.fiap.jdbc.model.Compra;
import br.com.fiap.jdbc.model.Pessoa;

public class teste {

	public static void main(String[] args) {

		CompraDAO compraDAO = new CompraDAO();
		
		List<Compra> compras = new ArrayList<Compra>();
		compras = compraDAO.listarTodos(102);
		
		for (Compra compra : compras) {
			System.out.println(compra.getCd_pessoa());
			System.out.println(compra.getDate_compra());
			System.out.println(compra.getStatus());
			System.out.println(compra.getLocal_compra());
		}
		
		/*
		PessoaDAO pessoDAO = new PessoaDAO();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas = pessoDAO.listarTodos();
		
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}*/
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
