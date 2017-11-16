package py.edu.uca.lp3.clase05.instrumento;

public class Brass extends Instrument {
	/*
	 * La clase Brass extiende la clase abstracta Instrument, por lo tanto está
	 * obligada a implementar el método abstract "play"
	 */
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
}
