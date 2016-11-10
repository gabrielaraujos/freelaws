package br.com.freela.freelaws.model;

import java.io.Serializable;
import java.util.List;

//@Entity
public class Freelancer extends Usuario implements Serializable {

	private static final long serialVersionUID = 3914652452707342886L;
	private String profissao;
	private List<Curso> formacao;
	private List<Idioma> idiomas;

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public List<Curso> getFormacao() {
		return formacao;
	}

	public void setFormacao(List<Curso> formacao) {
		this.formacao = formacao;
	}

	public List<Idioma> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(List<Idioma> idiomas) {
		this.idiomas = idiomas;
	}

}
