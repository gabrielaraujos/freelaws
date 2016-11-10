package br.com.freela.freelaws.model;

import java.io.Serializable;

import br.com.freela.freelaws.enums.Cidade;
import br.com.freela.freelaws.enums.Estado;
import br.com.freela.freelaws.enums.Pais;

public class Localizacao extends Model implements Serializable {
	private Pais pais;
	private Cidade cidade;
	private Estado estado;

	public Localizacao(Pais pais, Cidade cidade, Estado estado) {
		this.pais = pais;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Localizacao() {
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
