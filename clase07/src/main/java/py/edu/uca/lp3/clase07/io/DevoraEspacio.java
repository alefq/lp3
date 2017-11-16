package py.edu.uca.lp3.clase07.io;

import java.io.File;
import java.io.IOException;

public class DevoraEspacio {

	// public static void main(String[] args) {
	// DevoraEspacio devorador = new DevoraEspacio();
	// devorador.consumir("prueba");
	// }
	// static final Logger logger = Logger.getLogger(DevoraEspacio.class);

	public static void main(String[] args) {
		// DOMConfigurator.configure("/home/juca/Descargas/log4j.xml");
		// logger.trace("mensaje de trace");
		// logger.debug("Sample debug message");
		// logger.info("Sample info message");
		// logger.warn("Sample warn message");
		// logger.error("Sample error message");
		// logger.fatal("Sample fatal message");
	}

	public void consumir(String nombreThread) {
		for (int i = 0; i < 1000; i++) {

			try {
				String bufferCadena = ArchivoUtil
						.leerArchivoTexto("/etc/passwd");
				System.out
						.println("consumiendo archivo con cantidad de caracteres: "
								+ bufferCadena.length());
				/*
				 * Creación del fichero temporal. "prefijo" es cualquier cadena
				 * de al menos tres caracteres Si usamos null de segundo
				 * párametro, se usará por omisión ".tmp". Si no, se usará la
				 * que pongamos.
				 */
				File temporal = File.createTempFile(nombreThread + "-" + i,
						null);

				/* Se indica que se borre el fichero al terminar el programa */
				temporal.deleteOnExit();

				/* Se comprueba que se ha creado */
				if (temporal.exists()) {
					System.out.println("Creado " + temporal.getName());
					/*
					 * Aquí podemos abrir el fichero y escribir cosas en él para
					 * leerlas más adelante, donde nos haga falta
					 */
					ArchivoUtil.escribirArchivo(temporal.getAbsolutePath(),
							bufferCadena);
				}
				Thread.sleep(500);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
