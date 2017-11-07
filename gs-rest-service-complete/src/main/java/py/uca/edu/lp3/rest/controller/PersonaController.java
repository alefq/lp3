package py.uca.edu.lp3.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.LoginResponse;
import py.uca.edu.lp3.constants.ApiPaths;
import py.uca.edu.lp3.domain.Persona;
import py.uca.edu.lp3.service.PersonaService;

@RestController
public class PersonaController {

	// Simulamos el design pattern de Controller-Service-Data_Access
	// típico de aplicaciones basadas en el framework Spring
	private PersonaService personaService = PersonaService.buildInstance();

	@RequestMapping(ApiPaths.PERSONA)
	public Persona obtenerPersona(@RequestParam(value = "numeroCedula", required = true) Integer numeroCedula) {
		return personaService.findPersonaByNroCedula(numeroCedula);
	}

	// Creamos un nuevo método y un nuevo REST Endpoint, para implementar un login
	// con Request parameters (desde el URL)
	@RequestMapping(ApiPaths.LOGIN)
	public LoginResponse login(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		// El LoginResponse es la clase que informará al cliente REST (navegador, otro
		// cliente app, mobile app, etc.)
		// del resultado de la operación de login
		LoginResponse response = personaService.validateLogin(username, password);
		return response;
	}
}
