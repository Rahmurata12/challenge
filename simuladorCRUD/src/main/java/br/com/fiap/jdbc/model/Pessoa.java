package br.com.fiap.jdbc.model;

import java.sql.Date;

public class Pessoa {

	private int cd_pessoa;
	private String nome;
	private String RG;
	private String CPF;
	private Date data_nascimento;
	private int cd_genero;

	public int getCd_pessoa() {
		return cd_pessoa;
	}

	public void setCd_pessoa(int cd_pessoa) {
		this.cd_pessoa = cd_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public int getCd_genero() {
		return cd_genero;
	}

	public void setCd_genero(int cd_genero) {
		this.cd_genero = cd_genero;
	}

	public Pessoa(String nome, String rG, String cPF, Date data_nascimento, int cd_genero) {
		this.nome = nome;
		RG = rG;
		CPF = cPF;
		this.data_nascimento = data_nascimento;
		this.cd_genero = cd_genero;
	}

	public Pessoa() {
	}


}
