package py.edu.uca.lp3.clase02;

public class Arboles {
	/*
	 * La clase Arboles tiene varios constructores, se invocan según el número
	 * de parámetros que tenga la invocación, son distintas formas de
	 * construir/instanciar esta clase
	 */
	public Arboles() {
		System.out.println("Un árbol genérico");
	}

	public Arboles(String tipo) {
		System.out.println("Un árbol tipo " + tipo);
	}

	public Arboles(int altura) {
		System.out.println("Un árbol de " + altura + " metros");
	}

	public Arboles(int altura, String tipo) {
		/*
		 * "CTRL-/" ó "CTRL-7" (en teclados Latinoamericanos o Españoles) sirve
		 * para comentar o descomentar un bloque seleccionado o la línea en que
		 * se encuentra el cursor
		 */
		System.out.println("Un " + tipo + " de " + altura + " metros");
	}

	public static void main(String args[]) {
		/*
		 * Según los parámetros que utilizemos se construirán Arboles de
		 * distintas maneras, acorde al constructor que coincida con los tipos y
		 * nros. de parámetros
		 */
		Arboles arbol1 = new Arboles(4);
		Arboles arbol2 = new Arboles("Roble");
		Arboles arbol3 = new Arboles();
		Arboles arbol4 = new Arboles(5, "Pino");
	}
}
