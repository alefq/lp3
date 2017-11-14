package py.edu.uca.lp3.clase06.cadena;

import java.io.IOException;
import java.util.StringTokenizer;

public class CadenaApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		pruebasVariasString();
		// pruebaInmutabilidad();
		// pruebaTokens();
		// String strDatos = "6.3,6.2,6.4,6.2";
		// String [] partiods = strDatos.split(",");
		// for (int i = 0; i < partiods.length; i++) {
		// System.out.println(partiods[i]);
		// }
	}

	protected static void pruebaTokens() {
		String strDatos = "6.3,6.2,6.4,6.2";
		StringTokenizer tokens = new StringTokenizer(strDatos, ",");
		int nDatos = tokens.countTokens();
		double[] datos = new double[nDatos];
		int i = 0;
		while (tokens.hasMoreTokens()) {
			String str = tokens.nextToken();
			// datos[i] = Double.valueOf(str).doubleValue();
			// System.out.println(datos[i]);
			System.out.println(str);
			i++;
		}
	}

	private static void pruebaInmutabilidad() {
		// String a la que apunta la variable referenciada s.
		String s = "Roberto";

		// Al aplicarle el método concat(..), se crea otra String,
		// que contiene Roberto Fernandez, sin modificar la original.
		// Ocurre, que la nueva String está desreferenciada, es decir,
		// no hay ninguna variable que apunte a la misma.
		s.concat(" Fernandez");

		// Por consola: Roberto
		System.out.println(s);

		/*
		 * La clase StringBuffer se estudiará más adelante. Basta saber que se emplea
		 * para almacenar cadenas de texto que cambian con mucha frecuencia. Se
		 * introduce para comprobar que sólo las Strings son inmutables, no el resto de
		 * objetos.
		 */

		// StringBuffer a la que apunta la variable referenciada sb.
		StringBuffer sb = new StringBuffer("Roberto");

		// Al aplicarle el método append(..), NO se crea otra,
		// sino que se modifica la original agregándole " Fernandez"
		sb.append(" Fernandez");

		// Por consola: Roberto Fernandez
		System.out.println(sb);

		/* Si se trabaja con variables primitivas */
		int x = 10;
		x++;

		// Por consola: 11
		System.out.println(x);
	}

	private static void pruebasVariasString() {
		/* longitud del string */
		String str = "El primer programa";
		System.out.println("longitud " + str.length());
		/* comienza y termina por... */
		str = "El primer programa";
		System.out.println("comienza por El      " + str.startsWith("A"));
		System.out.println("termina por programa " + str.endsWith("programa"));
		/* posición de un carácter */
		int pos = str.indexOf('p');
		System.out.println("posición de la letra p " + pos);
		/*
		 * segunda ocuurencia de p pos = str.indexOf('p', pos + 1); /* comparación
		 */
		str = "Arnaldo";
		System.out.println("Orden alfabético " + str.compareTo("Alberto"));
		str = "Alberto";
		System.out.println("Orden alfabético " + str.compareTo("Tomás"));
		System.out.println("Orden alfabético " + str.compareTo("Alberto"));
		/* substring */
		str = "El lenguaje Java";
		System.out.println("Substring " + str.substring(12));
		System.out.println("Substring " + str.substring(3, 11));
		/* eliminar los espacios en blanco */
		str = "            12     monos         ";
		System.out.println("string original:<" + str + ">");
		System.out.println("string sin espacios en blanco:<" + str.trim() + ">");
		/* convertir un número en string */
		int valor = 24;
		str = String.valueOf(valor);
		str = "" + valor;
		System.out.println("número --> string " + str);
		/* convertir un string en número */
		str = "  12 ";
		int numeroInt = Integer.parseInt(str.trim());
		System.out.println("string --> número " + numeroInt);
		str = "12.35 ";
		double numeroDouble = Double.valueOf(str).doubleValue();
		System.out.println("string --> número " + numeroDouble);

		/* espera la pulsación de una tecla y luego RETORNO/ENTER */
		try {
			System.in.read();
		} catch (IOException e) {
			/* TODO Auto-generated catch block */
			e.printStackTrace();
		}
	}

}
