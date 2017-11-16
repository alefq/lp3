package py.edu.uca.lp3.clase07.io;

import java.io.File;
import java.io.IOException;

public class ArchivosApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArchivosApp app = new ArchivosApp();
		app.pruebaListarArchivos("/usr");
		String rutaArchivo = "/etc/hosts";
		app.mostrarPropiedadesDeFile(rutaArchivo);
		String destino = "/tmp/copia.txt";
		File origen = new File(rutaArchivo);
		File destinoCopia = new File(destino);
		try {
			ArchivoUtil.copiarArchivo(origen, destinoCopia);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pruebaListarArchivos(String directorio) {
		File file = new File(directorio);
		if (file.isDirectory()) {
			String files[] = file.list();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		} else
		{
			System.out.println("El archivo " + directorio.toString() + " no es un directorio");
			System.out.println("El archivo " + directorio + " no es un directorio");
		}

	}

	/*
	 * En este ejemplo presentamos algunos de los métodos que la clase File nos
	 * proporciona para conocer los detalles de un fichero.
	 */
	static void imprimir(String s) {
		System.out.println(s);
	}

	public void mostrarPropiedadesDeFile(String rutaArchivo) {
		File fich = new File(rutaArchivo);
		imprimir("Nombre del fichero : " + fich.getName());
		imprimir("Path relativo : " + fich.getPath());
		imprimir("Path Absoluto : " + fich.getAbsolutePath());
		imprimir("Directorio padre : " + fich.getParent());
		imprimir(fich.exists() ? "existe" : "no existe");
		imprimir("Ultima modificación del fichero : " + fich.lastModified());
		imprimir(fich.canWrite() ? "es de escritura" : "no es de escritura");
		imprimir(fich.canRead() ? "es de lectura" : "no es de lectura");
		imprimir(fich.isFile() ? "fichero normal" : "no normal");
		imprimir("Tamaño del fichero : " + fich.length() + "Bytes");

		imprimir("URI del fichero : " + fich.toURI());
		fich.setReadOnly();// ta

	}

	public void existeArchivo(String sFichero) {
		File fichero = new File(sFichero);

		if (fichero.exists())
			System.out.println("El fichero " + sFichero + " existe");
		else
			System.out.println("Pues va a ser que no");
	}
}
