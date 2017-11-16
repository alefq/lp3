package py.edu.uca.lp3.clase07.io;

/**
 * @file EscribirEnFicheroProperties.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date 05-febrero-2007
 * @url   http://lineadecodigo.com/2008/02/06/escribir-en-un-fichero-de-texto-con-java/
 * @description Escribir contenido sobre un fichero de texto  
 */

import java.io.*;

public class EscribirFicheroTexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Validamos si existe el fichero
		String sFichero = "/tmp/archivo.txt";
		File fichero = new File(sFichero);

		if (fichero.exists())
			System.out.println("El fichero " + sFichero + " ya existe");
		else {
			try {
				FileWriter fileWriter = new FileWriter(sFichero);
//				BufferedWriter bw = new BufferedWriter(fileWriter);
//
//				// Escribimos 10 filas
				for (int x = 0; x < 10; x++)
//					bw.write("Fila numero " + x + "\n");
				fileWriter.write("Fila numero " + x + "\n");


				// Hay que cerrar el fichero
//				bw.close();
				fileWriter.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
