package py.edu.uca.lp3.clase04;

import py.edu.uca.lp3.clase02.Persona;
import py.edu.uca.lp3.clase04.interfaces.Cotizable;
import py.edu.uca.lp3.clase04.interfaces.Peleador;
import py.edu.uca.lp3.clase04.interfaces.Volador;

public class Superman extends Persona implements Volador, Peleador, Cotizable {
	/*
	 * Hacemos que la calse Superman herede de Persona, y además que implemente
	 * las capacidades/protocolos/comportamientos de Volador y Peleador
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = -1702204164231353048L;

	public static void main(String[] args) {
		Superman chila = new Superman();
		Volador volador = chila;
		volador.volar();
		
		Peleador peleador =  chila; //Upcasting
		peleador.pelear();
		//
		// Peleador peleador=new Superman();
		// peleador.pelear();
	}

	public Superman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Superman(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);
		// TODO Auto-generated constructor stub
	}

	public void volar() {
		System.out.println("Volando Superman");

	}

	public void pelear() {
		System.out.println("Peleando Superman");

	}

	public Long getPrecio(String identificador) {
		return 1000l;
	}

	public String getColorCapa() {
		return "roja";
	}


}
