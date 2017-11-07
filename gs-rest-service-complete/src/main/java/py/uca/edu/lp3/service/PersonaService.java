package py.uca.edu.lp3.service;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import hello.LoginResponse;
import py.uca.edu.lp3.domain.Alumno;
import py.uca.edu.lp3.domain.Persona;
import py.uca.edu.lp3.domain.Profesor;

public class PersonaService {

	// Utilizamos una clave maestra con esta constante, con fines didácticos
	private static final String MASTERKEY = "123456";

	private List<Persona> personasExampleList = new ArrayList<Persona>();

	public PersonaService() {
		initializeExamples();
	}

	private void initializeExamples() {
		// Inicializamos dos personas de ejemplo
		Profesor luca = new Profesor();
		luca.setNumeroCedula(111);
		luca.setNombre("Luca");
		Alumno bart = new Alumno();
		bart.setNumeroCedula(222);
		bart.setNombre("Bart");

		// Agragamos a nuestra lista
		personasExampleList.add(luca);
		personasExampleList.add(bart);
	}

	public Persona findPersonaByNroCedula(Integer numeroCedula) {
		Persona personaARetornar = null;
		// En este ejemplo recorremos la lista de ejemplo
		// en un ejemplo más complejo de uso real consultaríamos un repositorio de datos
		// Base de Datos, otro Web Service, algún servicio de mensajería, etc.
		for (Persona personaIteracion : personasExampleList) {
			if (numeroCedula != null && numeroCedula.equals(personaIteracion.getNumeroCedula())) {
				personaARetornar = personaIteracion;
			}
		}
		return personaARetornar;
	}

	public static PersonaService buildInstance() {
		// Para fines didácticos este factory retorna una instancia común
		// En un ambiente de Spring Boot completo esto sería un @Service
		// que se haría @Autowired
		return new PersonaService();
	}

	public LoginResponse validateLogin(String username, String password) {
		LoginResponse response = new LoginResponse();
		if (StringUtils.isNoneBlank(username, password) && password.equals(MASTERKEY)) {
			// Con fines didácticos, la autenticación se
			response.setSuccess(true);
		} else {
			// Con fines didácticos si la contraseña no coincide con el MASTERKEY informamos
			// que hay problemas con las credenciales
			response.setSuccess(false);
			response.setMessage("Credenciales incorrectas");
		}
		return response;
	}

}
