package br.com.freela.freelaws.model;

import java.io.Serializable;
import java.util.List;

//@Entity
public class Freelancer extends Usuario implements Serializable {

	private static final long serialVersionUID = 3914652452707342886L;
	private String profissao;
	private List<Curso> formacao;
	private List<Idioma> idiomas;

}
