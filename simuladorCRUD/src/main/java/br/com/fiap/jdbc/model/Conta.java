package br.com.fiap.jdbc.model;

public class Conta {

	private int renda_mesnsal;
	private int fatura_mensal;
	private int cd_pessoa;
	private int cd_conta;

	public int getRenda_mesnsal() {
		return renda_mesnsal;
	}

	public void setRenda_mesnsal(int renda_mesnsal) {
		this.renda_mesnsal = renda_mesnsal;
	}

	public int getFatura_mensal() {
		return fatura_mensal;
	}

	public void setFatura_mensal(int fatura_mensal) {
		this.fatura_mensal = fatura_mensal;
	}

	public int getCd_pessoa() {
		return cd_pessoa;
	}

	public void setCd_pessoa(int cd_pessoa) {
		this.cd_pessoa = cd_pessoa;
	}

	public int getCd_conta() {
		return cd_conta;
	}

	public void setCd_conta(int cd_conta) {
		this.cd_conta = cd_conta;
	}

	public Conta(int renda_mesnsal, int fatura_mensal, int cd_pessoa) {
		super();
		this.renda_mesnsal = renda_mesnsal;
		this.fatura_mensal = fatura_mensal;
		this.cd_pessoa = cd_pessoa;
	}

	public Conta() {
	}

}
