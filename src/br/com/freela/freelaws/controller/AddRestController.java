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
	@RequestMapping(value = "{freelancer}", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	private void addFreelancer(@RequestBody Freelancer freelancer) {
		// insere freelancer na bd
	}

	@RequestMapping(value = "{empresa}", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	private void addEmpresa(@RequestBody Empresa empresa) {
		// insere empresa na bd
	}

	// cadastrar oportunidade
	@RequestMapping(value = "{oportunidade}", method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.CREATED)
	private void addOportunidade(@RequestBody Oportunidade oportunidade) {
		// insere oportunidade na bd
	}
}
