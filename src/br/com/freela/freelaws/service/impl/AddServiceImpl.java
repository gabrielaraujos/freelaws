package br.com.freela.freelaws.service.impl;

import java.io.Serializable;

import br.com.freela.freelaws.model.Empresa;
import br.com.freela.freelaws.model.Freelancer;
import br.com.freela.freelaws.service.AddService;

//@Service
public abstract class AddServiceImpl implements AddService, Serializable {

	private static final long serialVersionUID = 3747742550756843437L;

	// @Autowired
	// AddDAO addDAO;

	@Override
	public void addFreelancer(Freelancer freelancer) {
		// addDAO.addFreelancer(freelancer);
	}

	@Override
	public void addEmpresa(Empresa empresa) {
		// addDAO.addEmpresa(empresa);
	}

}
