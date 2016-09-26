package br.com.freela.freelaws.service;

import br.com.freela.freelaws.model.Empresa;
import br.com.freela.freelaws.model.Freelancer;

public interface AddService {
	public void addFreelancer(Freelancer freelancer);

	public void addEmpresa(Empresa empresa);
}
