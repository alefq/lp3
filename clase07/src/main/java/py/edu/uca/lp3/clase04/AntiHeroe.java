package py.edu.uca.lp3.clase04;

import py.edu.uca.lp3.clase02.Persona;
import py.edu.uca.lp3.clase04.interfaces.Mentiroso;
import py.edu.uca.lp3.clase04.interfaces.Peleador;
import py.edu.uca.lp3.clase04.interfaces.Volador;

public class AntiHeroe extends Persona implements Volador, Peleador, Mentiroso {
	/*
	 * La clase antiheroe se puede decir que es polimorfica, porque se comporta
	 * de distintas formas, implementando varias interfaces
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = -381469417892240772L;

	/*
	 * Para cumplir con el contrato de la interfaz Mentiroso, debemos
	 * implementar el método que nos permita comportarnos como un Mentiroso
	 */
	public void mentir() {
		System.out.println("Mintiendo como antiheroe");
	}

	/* Cumplimos con el contrato de Peleador */
	public void pelear() {
		System.out.println("peleando como antiheroe");

	}

	/*
	 * Estamos declarando que implementamos la interfaz Volador, por lo que
	 * debemos cumplir con ese contrato y tener un método que nos permita
	 * recibir el mensaje ".volar()"
	 */
	public void volar() {
		System.out.println("volando como antiheroe");

	}

}
