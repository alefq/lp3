package py.edu.uca.lp3.clase05.instrumento;

import java.util.ArrayList;
import java.util.List;

public class MusicaApp {

	public static void tune(Instrument instrumento) {
		/*
		 * El método tune recibe una clase que se comportará como un Instrument,
		 * es decir utilizo la Interface Instrument para definir el tipo de dato
		 * que recibiré
		 */
		instrumento.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); /*
					 * Al llamar al método static "tune" estoy haciendo un
					 * Upcasting, "conviertiendo" la clase Wind a una de las
					 * interfaces que implemneta.
					 */
		/* Ejemplos de RunTimeException */
		List lista = new ArrayList();
		List otraLista = null;
		lista.add(new Wind());
		lista.add(new Brass());
		/*
		 * Ejemplos de RunTimeException
		 */
		/* Esta línea arrojará un java.lang.IndexOutOfBoundsException */
		// Object prueba = lista.get(3);
		/* ClassCastException */
		// Brass viento = (Brass) lista.get(0);
		/* NullPointerException */
		// System.out.println(otraLista.size());
	}
}