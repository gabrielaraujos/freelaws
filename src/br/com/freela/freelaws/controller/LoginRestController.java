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

import br.com.freela.freelaws.enums.Papel;
import br.com.freela.freelaws.model.Credenciais;
import br.com.freela.freelaws.model.Usuario;

@RestController
@RequestMapping(value = "login")
public class LoginRestController {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Map<String, Object> login(@RequestBody Credenciais credenciais) {

		Map<String, Object> resultado = new HashMap<>();

		try {

			if (credenciais.getLogin().equals("gabriel@email.com") && credenciais.getSenha().equals("freela")) {

				System.out.println("Logado!");

				Usuario usuario = new Usuario();

				// usuario.setId(1L);
				usuario.setNome("Freela");
				usuario.setPapel(Papel.FREELANCER);

				resultado.put("usuario", usuario);

				return resultado;

			} else {

				throw new Exception("Usu�rio n�o econtrado.");

			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

			return null;

		}

	}

}
