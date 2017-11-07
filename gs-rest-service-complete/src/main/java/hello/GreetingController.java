package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import py.uca.edu.lp3.domain.Persona;
import py.uca.edu.lp3.rest.controller.LoginResponse;
import py.uca.edu.lp3.service.PersonaService;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	// Simulamos el design pattern de Controller-Service-Data_Access
	private PersonaService personaService = PersonaService.buildInstance();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping("/persona")
	public Persona obtenerPersona(@RequestParam(value = "numeroCedula", required = false) Integer numeroCedula) {
		return personaService.findPersonaByNroCedula(numeroCedula);
	}

	// Creamos un nuevo método y un nuevo REST Endpoint, para implementar un login
	// con Request parameters (desde el URL)
	@RequestMapping("/login")
	public LoginResponse login(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		// El LoginResponse es la clase que informará al cliente REST (navegador, otro
		// cliente app, mobile app, etc.)
		// del resultado de la operación de login
		LoginResponse response = new LoginResponse();
		// personaService.validateLogin(username, password);
		return response;
	}
}
