package br.com.freela.freelaws.enums;

public enum Papel {
	FREELANCER(0), EMPRESA(1);

	private final Integer id;

	private Papel(final Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

}
