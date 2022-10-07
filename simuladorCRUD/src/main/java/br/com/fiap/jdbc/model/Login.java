package br.com.fiap.jdbc.model;

public class Login {

	private String usuario;
	private String senha;
	private int cd_login;
	private int cd_pessoa;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getCd_login() {
		return cd_login;
	}

	public void setCd_login(int cd_login) {
		this.cd_login = cd_login;
	}

	public int getCd_pessoa() {
		return cd_pessoa;
	}

	public void setCd_pessoa(int cd_pessoa) {
		this.cd_pessoa = cd_pessoa;
	}

	public Login(String usuario, String senha, int cd_pessoa) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.cd_pessoa = cd_pessoa;
	}

	public Login() {
	}

}
