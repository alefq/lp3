package py.edu.uca.lp3.clase07.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* Obtenido de:
 * http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java */
public class LeeFichero {
	public static void main(String[] arg) {
		LeeFichero leer = new LeeFichero();
		String nombreArchivo = "/etc/hosts";
		leer.leer(nombreArchivo);
		/* Definimos una referencia a un array de bytes para usar de buffer */
		byte[] leidos;
		try {
			leidos = ArchivoUtil.leerArchivoBinario(nombreArchivo);
			String stringLeido = new String(leidos);
			System.out.println("Leido: " + stringLeido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void leer(String ruta) {
		File archivo = null;
		FileReader fileReader = null;
		BufferedReader bufferReader = null;

		try {
			/*
			 * Apertura del fichero y creacion de BufferedReader para poder
			 * hacer una lectura comoda (disponer del metodo readLine()).
			 */
			archivo = new File(ruta);
			/* Creamos un reader */
			fileReader = new FileReader(archivo);
			/*
			 * Utilizamos un buffered reader para aprovechar la funcionalidad
			 * que viene con las librerías estándares de java que hace el manejo
			 * de lectura y escritura manejando buffers para mejorar la
			 * performance de acceso a disco
			 */
			bufferReader = new BufferedReader(fileReader);

			/* Lectura del fichero */
			String linea;
			while ((linea = bufferReader.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*
			 * En el finally cerramos el fichero, para asegurarnos que se cierra
			 * tanto si todo va bien como si salta una excepcion.
			 */
			try {
				if (null != fileReader) {
					fileReader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}