package py.edu.uca.lp3.clase07.io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Utilidad (clase estática) para agrupar todas las funcionalidades que traten
 * con manejo de archivos
 * 
 * @author juca
 * 
 */
public class ArchivoUtil {

	/**
	 * Lee un archivo de texto, de la ruta especificada
	 * 
	 * @param ruta
	 * @return
	 * @throws IOException
	 */
	public static String leerArchivoTexto(String ruta) throws IOException {
		String stringLeido = new String(leerArchivoBinario(ruta));
		return stringLeido;
	}

	/**
	 * Lee un archivo binario de la ruta especificada y retorna en formato de
	 * byte
	 * 
	 * @param ruta
	 * @return
	 * @throws IOException
	 */
	public static byte[] leerArchivoBinario(String ruta) throws IOException {
		/* Definimos la referencia para el buffer de lectura */
		byte[] retorno = null;
		/* Definimos la referencia a un archivo */
		File archivo = null;
		/*
		 * Definimos la implementación de la clase abstracta InputStream, en
		 * este caso leeremos del sistema de archivos, por lo que usamos la
		 * clase FileInputStream
		 */
		FileInputStream fileInput = null;

		try {
			/*
			 * Apertura del fichero y creacion de BufferedReader para poder
			 * hacer una lectura comoda (disponer del metodo readLine()).
			 */
			archivo = new File(ruta);
			fileInput = new FileInputStream(archivo);
			long tamanho = archivo.length();
			/*
			 * reservamos dinámicamente la memoria para el array, según el
			 * tamanho que tenga el archivo
			 */
			retorno = new byte[(int) tamanho];
			/* Con este método, leemos "tamanho" bytes, en el buffer "retorno" */
			fileInput.read(retorno);

		} finally {
			/*
			 * En el finally cerramos el fichero, para asegurarnos que se cierra
			 * tanto si todo va bien como si salta una excepcion.
			 */
			try {
				if (null != fileInput) {
					/*
					 * La operacion de close, puede nuevamente generar una
					 * excepcion
					 */
					fileInput.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		return retorno;
	}

	public static void escribirArchivo(String ruta, String datos)
			throws IOException {
		/*
		 * Las clases Buffered... son implementaciones que hacen uso de un
		 * buffer para optimizar los accesos a disco. Para casos de archivos de
		 * texto, se recomienda usar las clases descendientes de Writer
		 */
		BufferedWriter bwriter = new BufferedWriter(new FileWriter(ruta));
		bwriter.write(datos);
		bwriter.close();

	}

	public static void escribirArchivoBinario(String ruta, byte[] datos)
			throws IOException {
		/* Para archivos binarios, se recomienda usar el FileOutputStream */
		BufferedOutputStream bout = new BufferedOutputStream(
				new FileOutputStream(ruta));
		bout.write(datos);
		bout.close();

	}

	public static void copiarArchivo(File source, File dest) throws IOException {
		if (!dest.exists()) {
			/* Si el archivo no existe, creamos uno nuevo */
			dest.createNewFile();
		}
		/* Definimos el stream para lectura */
		InputStream in = null;
		/* Definimos el outputStrem al que escribiremos */
		OutputStream out = null;
		try {
			/*
			 * Usamos la pareja File... porque leeremos y escribiremos a
			 * archivos
			 */
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);
			/*
			 * Dependiendo del tamaño del buffer se harán más o menos pasadas,
			 * según el tamaño del archivo
			 */
			// byte[] buf = new byte[10];
			byte[] buf = new byte[1024];
			int len;

			/* Leo 1kB = 1024 bytes */
			len = in.read(buf);
			while (len > 0) {
				System.out.println("Escribiendo " + len + " bytes");
				out.write(buf, 0, len);
				len = in.read(buf);
			}
		} finally {
			/* Finalmente ocurra o no excepciones, cerramos ambos streams */
			in.close();
			out.close();
		}

	}

}
