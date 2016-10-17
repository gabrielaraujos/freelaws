package br.com.freela.freelaws.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.freela.freelaws.model.Usuario;

@RestController
@RequestMapping(value = "login")
public class LoginRestController {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Usuario login(HttpServletResponse response, @RequestBody Usuario usuario) {
		if (usuario.getEmail().equals("freela@email.com") && usuario.getSenha().equals("freela321")) {
			response.setStatus(HttpStatus.OK.value());
			System.out.println("Logado!");
		} else {
			response.setStatus(HttpStatus.NOT_FOUND.value());
			usuario = null;

			System.out.println("Usuário não encontrado");
		}

		return usuario;
	}

}
