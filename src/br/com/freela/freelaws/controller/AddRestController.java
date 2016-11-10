package br.com.freela.freelaws.controller;

import java.util.HashMap;
import java.util.Map;

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

	@RequestMapping(value = "freelancer", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Map<String, Object> addFreelancer(@RequestBody Freelancer freelancer) {

		Map<String, Object> resultado = new HashMap<>();

		try {

			freelancer.setId(1L);

			System.out.println("Usuário cadastrado");

			resultado.put("usuario", freelancer);

			return resultado;

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
