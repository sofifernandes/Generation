package org.generation.blogPessoal.model;

public class UserLogin {
	
	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String email;
	
	private String token;
	
	private boolean vendedor;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isVendedor() {
		return vendedor;
	}	

	public void setVendedor(boolean vendedor) {
		this.vendedor = vendedor;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}