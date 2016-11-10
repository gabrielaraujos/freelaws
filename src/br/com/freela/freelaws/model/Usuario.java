package br.com.freela.freelaws.model;

import java.io.Serializable;

import br.com.freela.freelaws.enums.Papel;

public class Usuario extends Model implements Serializable {
	private String email;
	private String senha;
	private String nome;
	private Papel papel;
	private Localizacao localizacao;

	public String getEmail() {
		return email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getPapel() {
		return papel.getId();
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}

}
