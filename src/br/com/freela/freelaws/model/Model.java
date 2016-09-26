package br.com.freela.freelaws.model;

import java.io.Serializable;

//@Entity
public class Model implements Serializable {

	private static final long serialVersionUID = -7044623687556959329L;

	// @Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
