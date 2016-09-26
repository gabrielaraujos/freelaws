package br.com.freela.freelaws.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import br.com.freela.freelaws.dao.AddDAO;
import br.com.freela.freelaws.model.Empresa;
import br.com.freela.freelaws.model.Freelancer;

@Component
public class AddDAOImpl extends DAOImpl implements AddDAO, Serializable {

	private static final long serialVersionUID = -6694328807617233302L;

	@Override
	public void addFreelancer(Freelancer freelancer) {
		inserir(freelancer);
	}

	@Override
	public void addEmpresa(Empresa empresa) {
		inserir(empresa);
	}

}
