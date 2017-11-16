package py.edu.uca.lp3.clase07.io;

import java.io.File;
import java.io.IOException;

public class ArchivoTemporalApp {

	public static void main(String[] args) {
		try {
			/*
			 * Creación del fichero temporal. "prefijo" es cualquier cadena de
			 * al menos tres caracteres Si usamos null de segundo párametro, se
			 * usará por omisión ".tmp". Si no, se usará la que pongamos.
			 */
			File temporal = File.createTempFile("jucaApp-", null);

			/* Se indica que se borre el fichero al terminar el programa */
			temporal.deleteOnExit();

			/* Se comprueba que se ha crado */
			if (temporal.exists()) {
				System.out.println("Creado " + temporal.getName());
				/*
				 * Aqui podemos abrir el fichero y escribir cosas en él para
				 * leerlas más adelante, donde nos haga falta
				 */
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		pruebaEspacioDiscos();
		borrar("/tmp/borrame.txt");
	}

	private static void borrar(String ruta) {
		File archivo = new File(ruta);
		if (archivo.delete())
			System.out.println("Archivo Borrado: " + ruta);
		else
			System.err.println("No se pudo borrar: " + ruta);
	}

	private static void pruebaEspacioDiscos() {
		/* Obtenemos los directorios raiz de cada disco disponible */
		File[] roots = File.listRoots();

		/*
		 * Escribimos el nombre del disco, su espacio libre y su espacio total.
		 */
		for (File root : roots) {
			System.out.println("En " + root + " hay " + root.getFreeSpace()
					+ " libres de un total de " + root.getTotalSpace());
		}
	}
}