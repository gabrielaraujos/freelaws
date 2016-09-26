package br.com.freela.freelaws.dao;

import br.com.freela.freelaws.model.Empresa;
import br.com.freela.freelaws.model.Freelancer;

public interface AddDAO {
	public void addFreelancer(Freelancer freelancer);

	public void addEmpresa(Empresa empresa);
}
