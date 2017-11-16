package py.edu.uca.lp3.clase02;

import java.io.Serializable;

import py.edu.uca.lp3.clase04.identidad.Identificable;
import py.edu.uca.lp3.clase05.exception.NacionalidadException;
import py.edu.uca.lp3.clase06.util.ColeccionesUtil;

public class Persona implements Identificable, Serializable,
		Comparable<Persona> {
	/*
	 * Convertimos nuestra clase Persona al estandar Java Bean. Implementamos la
	 * interfaz Serializable. Mediante las interfaces establecemos un protocolo,
	 * o se dice también que especificamos comportamientos, el Que debe hacer
	 * sin especificar el Como
	 */

	/*
	 * El estándar JavaBean exige que se implemente la interfaz Serializable, y
	 * esta interfaz especifica que debe haber un identificador único del
	 * serialVersionID. Por medio del asistente del eclipse sobre el warning que
	 * aparece, en la línea de la definición de la clase, generamos
	 * automáticamente este nro.
	 */
	private static final long serialVersionUID = -4419931048984717671L;
	/* Generalizamos los campos comunes a todas las personas, en esta clase */
	private String nombre;
	/*
	 * Cambiamos el modificador de acceso a private para conformar el estandar
	 * JavaBean
	 */
	private String apellido;
	/*
	 * Cada propiedad tendrá sus accesors (getters y setters) para leer o
	 * escribir un nuevo valor
	 */
	private int edad;
	private int numeroCedula;
	private String codigoPais = CODIGO_ISO_PARAGUAY;

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, int edad) {
		/*
		 * Este constructor fue generado automáticamente mediante el menú
		 * contextual del editor de códigos fuente Source/Generate constructor
		 * using fields...
		 */
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellido, int edad, int nroCedula) {
		/*
		 * Este constructor fue generado automáticamente mediante el menú
		 * contextual del editor de códigos fuente Source/Generate constructor
		 * using fields...
		 */
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.numeroCedula = nroCedula;
	}

	public Persona(int numeroCedula, String nombre) {
		super();
		this.nombre = nombre;
		this.numeroCedula = numeroCedula;
	}

	/*
	 * Los accesors se generan desde el menú contextual (Estando dentro de la
	 * clase para la que se quiere generar los accesors) Source/Generate Getters
	 * and Setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(int numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	@Override
	public String toString() {
		ColeccionesUtil.auditar(this);
		return getNombre() + " " + getApellido();
	}

	public String getNroIdentidad() {
		// TODO Auto-generated method stub
		// return ""+getNumeroCedula();
		return Integer.toString(getNumeroCedula());
	}

	public String getCodigoISOPais() {
		// TODO Auto-generated method stub
		return codigoPais;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public static void tratarNacionalidadException(NacionalidadException e) {
		/*
		 * En ciertos casos se puede generalizar el tratamiento de excetions en
		 * una utilidad como esta, en un método static
		 */
		System.out
				.println("Al inscribir un alumno ocurrio el siguiente problema:"
						+ e.getMessage());
		e.printStackTrace();

	}

	public int compareTo(Persona otraPersona) {
//		int retorno = 0;
//		if (getNumeroCedula() > otraPersona.getNumeroCedula()) {
//			retorno = 1;
//		} else if (otraPersona.getNumeroCedula() > getNumeroCedula()) {
//			retorno = -1;
//		} else {
//			retorno = 0;
//		}
//		return retorno;
		return getNombre().compareTo(otraPersona.getNombre()) * -1;
	}
}
