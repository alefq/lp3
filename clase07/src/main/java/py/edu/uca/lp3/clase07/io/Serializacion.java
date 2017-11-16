package py.edu.uca.lp3.clase07.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import py.edu.uca.lp3.clase02.Persona;

public class Serializacion {
	public static void main(String args[]) {
		/* Creamos una insancia nueva de la clase Serializacion */
		Serializacion serializacion = new Serializacion();
		String nombreArchivo = "/tmp/serial.txt";
		/*
		 * Serializamos el objeto, escribiendo a un archivo en el directorio
		 * temporal del usuario
		 */
		System.out.println("El directorio temporal es: "
				+ System.getProperties().get("java.io.tmpdir"));
		/*
		 * Con esto modificamos la ubicación del directorio temporal. También
		 * puede hacerse con un parámetro para la máquina virtual (VM)
		 * -Djava.io.tmpdir=/tmp/juca
		 */
		// System.getProperties().put("java.io.tmpdir", "/home/juca");
		// System.out.println("El directorio temporal es: "
		// + System.getProperties().get("java.io.tmpdir"));
		serializacion.serializarObjetoAArchivo(nombreArchivo);
		serializacion.deserializarObjetoDesdeArchivo(nombreArchivo);
	}

	public void deserializarObjetoDesdeArchivo(String nombreArchivo) {
		/* Deserialización del objeto */
		try {
			Persona personaLeidaDeArchivo;

			/* Inicializamos un InputStream para leer de un archivo */
			FileInputStream fileInStream = new FileInputStream(nombreArchivo);
			/* Inicializamos un inputStream específico para leer objetos */
			ObjectInputStream objectInstream = new ObjectInputStream(
					fileInStream);
			/* Leemos el objeto del inputStream */
			personaLeidaDeArchivo = (Persona) objectInstream.readObject();
			objectInstream.close();
			System.out.println("Persona de Archivo: " + personaLeidaDeArchivo);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(2);
		}
	}

	public void serializarObjetoAArchivo(String nombreArchivo) {
		try {
			/* Creamos una instancia de una clase serializable */
			Persona persona1 = new Persona("Cobie", "Smulders", 15);
			System.out.println("Persona: " + persona1);
			/* Creamos un OutputStream para escribir a un archivo */
			FileOutputStream fileOutstream = new FileOutputStream(nombreArchivo);
			/* OutputStream específico para escribir objetos */
			ObjectOutputStream objectOutStream = new ObjectOutputStream(
					fileOutstream);
			objectOutStream.writeObject(persona1);
			/*
			 * Se envía lo que pueda haber en el buffer al dispositivo que esté
			 * conectado, en nuestro caso al archivo del disco. Este paso es
			 * opcional, si se cerrará inmediatamente el OuputStream
			 */
			objectOutStream.flush();
			/*
			 * Cerramos el OutputStream. En este caso, cerrará el
			 * ObjectOutputStream y el FileOutputStream asociado
			 */
			objectOutStream.close();
		} catch (Exception e) {
			/*
			 * Si ocurrió un error, salimos con un mensaje, en el Standard Error
			 * y salimos de la aplicación con un código de error 1
			 */
			System.err.println(e.getMessage());
			/*
			 * Este es un caso especial en que no entraría al bloque finally,
			 * porque el System.exit termina la ejecución del proceso java
			 */
			System.exit(1);
		}
	}

}
