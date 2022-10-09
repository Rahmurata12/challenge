package br.com.fiap.jdbc.model;

import java.sql.Date;

public class Compra {

	private int cd_compra;
	private Date date_compra;
	private String status;
	private String local_compra;
	private int cd_pessoa;

	public int getCd_compra() {
		return cd_compra;
	}

	public void setCd_compra(int cd_compra) {
		this.cd_compra = cd_compra;
	}

	public Date getDate_compra() {
		return date_compra;
	}

	public void setDate_compra(Date date_compra) {
		this.date_compra = date_compra;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocal_compra() {
		return local_compra;
	}

	public void setLocal_compra(String local_compra) {
		this.local_compra = local_compra;
	}

	public int getCd_pessoa() {
		return cd_pessoa;
	}

	public void setCd_pessoa(int cd_pessoa) {
		this.cd_pessoa = cd_pessoa;
	}

	public Compra(Date date_compra, String status, String local_compra, int cd_pessoa) {
		super();
		this.date_compra = date_compra;
		this.status = status;
		this.local_compra = local_compra;
		this.cd_pessoa = cd_pessoa;
	}

	public Compra() {
	}

}
