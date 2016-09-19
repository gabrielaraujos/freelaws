package br.com.freela.freelaws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.freela.freelaws.model.Empresa;
import br.com.freela.freelaws.model.Freelancer;
import br.com.freela.freelaws.model.Oportunidade;

@RestController
@RequestMapping(value = "add")
public class CadastroRestController {
	@RequestMapping(value = "freelancer", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	private void cadastrarFreelancer(@RequestBody Freelancer freelancer) {
		// insere freelancer na bd
	}

	@RequestMapping(value = "empresa", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	private void cadastrarFreelancer(@RequestBody Empresa empresa) {
		// insere empresa na bd
	}

	// cadastrar oportunidade
	@RequestMapping(value = "oportunidade", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	private void cadastrarOportnidade(@RequestBody Oportunidade oportunidade) {
		// insere oportunidade na bd
	}
}
