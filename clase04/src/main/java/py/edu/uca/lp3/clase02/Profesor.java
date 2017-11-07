package py.edu.uca.lp3.clase02;

import java.io.Serializable;

public class Profesor extends Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1557616437829724017L;
	/*
	 * Especializamos la clase Persona, agregando un atributo exclusivo de esta
	 * clase por ser una clase hija de Persona, Profesor obtiene todas las
	 * propiedades y comportamientos de la clase Persona
	 */
	private int antiguedad;
	private int nroInscripcion;

	public int getAntiguedad() {
		return antiguedad;
	}

	public int getNroInscripcion() {
		return nroInscripcion;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void setNroInscripcion(int nroInscripcion) {
		this.nroInscripcion = nroInscripcion;
	}
}
