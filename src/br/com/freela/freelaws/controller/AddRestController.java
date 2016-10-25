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
import br.com.freela.freelaws.model.Usuario;

@RestController
@RequestMapping(value = "add")
public class AddRestController {
	// @Autowired
	// AddService addService;

	@RequestMapping(value = "freelancer", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public @ResponseBody Usuario addFreelancer(@RequestBody Freelancer freelancer) {
		try {
			// addService.addFreelancer(freelancer);
			freelancer.setId(1L);

			System.out.println("Usuário cadastrado");
			return freelancer;
		} catch (Exception e) {
			return null;
		}
	}

	@RequestMapping(value = "empresa", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public @ResponseBody Usuario addEmpresa(@RequestBody Empresa empresa) {
		try { // addService.addEmpresa(empresa);
			System.out.println("Usuário cadastrado");

			empresa.setId(1L);

			return empresa;
		} catch (Exception e) {
			return null;
		}
	}

	// cadastrar oportunidade
	@RequestMapping(value = "oportunidade", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public @ResponseBody Oportunidade addOportunidade(@RequestBody Oportunidade oportunidade) {
		try {
			// insere oportunidade na bd
			System.out.println("Oportunidade adicionada");

			oportunidade.setId(1L);

			return oportunidade;
		} catch (Exception e) {
			return null;
		}
	}
}
