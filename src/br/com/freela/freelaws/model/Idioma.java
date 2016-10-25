package br.com.freela.freelaws.model;

import java.io.Serializable;

import br.com.freela.freelaws.enums.Proficiencia;

public class Idioma extends Model implements Serializable {
	private String nome;
	private Proficiencia proficiencia;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Proficiencia getProficiencia() {
		return proficiencia;
	}

	public void setProficiencia(Proficiencia proficiencia) {
		this.proficiencia = proficiencia;
	}
}
