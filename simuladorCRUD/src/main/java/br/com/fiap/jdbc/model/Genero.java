package br.com.fiap.jdbc.model;

import java.util.ArrayList;
import java.util.List;

public class Genero {

	private int cd_genero;
	private String genero;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public Genero() {

	}

	public int getCd_genero() {
		return cd_genero;
	}

	public void setCd_genero(int cd_genero) {
		this.cd_genero = cd_genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void adicionarPessoa(Pessoa produto) {
		pessoas.add(produto);
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

}
