package br.com.freela.freelaws.model;

import java.io.Serializable;

import br.com.freela.freelaws.enums.Setor;
import br.com.freela.freelaws.enums.TipoEmpresa;

public class Empresa extends Usuario implements Serializable {

	private static final long serialVersionUID = -6629723272022240362L;
	private String especializacoes;
	private String site;
	private Setor setor;
	private TipoEmpresa tipo;

	public String getEspecializacoes() {
		return especializacoes;
	}

	public void setEspecializacoes(String especializacoes) {
		this.especializacoes = especializacoes;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public TipoEmpresa getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}
}
