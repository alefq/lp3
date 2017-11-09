package py.edu.uca.lp3.clase02;

import java.io.Serializable;

import py.edu.uca.lp3.clase04.interfaces.Volador;

public class Alumno extends Persona implements Serializable, Volador {
	/**
	 * 
	 */
	private static final long serialVersionUID = 437007582766814987L;
	/*
	 * Especializamos la clase Persona, agregando un atributo exclusivo de esta
	 * clase por ser una clase hija de Persona, Alumno obtiene todas las
	 * propiedades y comportamientos de la clase Persona
	 */
	private int numeroMatricula;

	public Alumno(String nombre, String apellido, int edad) {
		/*
		 * invocamos al constructor de la super clase (clase padre), en este
		 * caso se invoca al constructor de la clase persona
		 */
		super(nombre, apellido, edad);
	}

	public Alumno() {
		/*
		 * invocamos al constructor de la super clase (clase padre), en este
		 * caso se invoca al constructor de la clase persona
		 */
		super(-1, "sin nombre");
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		// return getNombre() + " " + getApellido() + "(" + getNumeroMatricula()
		// + ")";
		getPassword();
		return super.toString() + "(" + getNumeroMatricula() + ")";
	}

	private String getPassword() {
		return "";
	}
	
	@Override
	public String getNroIdentidad() {
		// TODO Auto-generated method stub
		return ""+getNumeroMatricula();
	}

	public void volar() {
		System.out.println("Volando Alumno");
		
	}
	
}
