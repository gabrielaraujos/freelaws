package br.com.freela.freelaws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.freela.freelaws.model.Empresa;
import br.com.freela.freelaws.model.Freelancer;
import br.com.freela.freelaws.model.Oportunidade;

@RestController
@RequestMapping(value = "add")
public class AddRestController {
	// @Autowired
	// AddService addService;

	@RequestMapping(value = "freelancer", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	public void addFreelancer(@RequestBody Freelancer freelancer) {
		// addService.addFreelancer(freelancer);
		System.out.println("Freelancer cadastrado");
	}

	@RequestMapping(value = "empresa", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	public void addEmpresa(@RequestBody Empresa empresa) {
		// addService.addEmpresa(empresa);
		System.out.println("Empresa cadastrado");
	}

	// cadastrar oportunidade
	@RequestMapping(value = "oportunidade", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	public void addOportunidade(@RequestBody Oportunidade oportunidade) {
		// insere oportunidade na bd
		System.out.println("Oportunidade adicionada");
	}
}
