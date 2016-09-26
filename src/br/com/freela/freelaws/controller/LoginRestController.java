package br.com.freela.freelaws.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "login")
public class LoginRestController {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.OK)
	public void login(HttpServletResponse response, @RequestBody String login, @RequestBody String senha) {
		if (login.equals("freela") && senha.equals("freela321")) {
			response.setStatus(HttpStatus.OK.value());
			System.out.println("Logado!");
		} else {
			response.setStatus(HttpStatus.NOT_FOUND.value());
			System.out.println("Usuário não encontrado");
		}
	}

}
