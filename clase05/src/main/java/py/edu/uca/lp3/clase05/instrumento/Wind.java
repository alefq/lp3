package py.edu.uca.lp3.clase05.instrumento;

public class Wind extends Instrument {
	/*
	 * La clase Wind extiende la clase abstracta Instrument, por lo tanto está
	 * obligada a implementar el método abstract "play"
	 */
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}
