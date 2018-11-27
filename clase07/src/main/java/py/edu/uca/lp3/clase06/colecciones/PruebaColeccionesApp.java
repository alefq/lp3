package py.edu.uca.lp3.clase06.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import py.edu.uca.lp3.clase01.Materia;
import py.edu.uca.lp3.clase02.Alumno;
import py.edu.uca.lp3.clase06.util.ColeccionesUtil;

public class PruebaColeccionesApp {
	/*
	 * Definimos un HashMap con clave de tipo Alumno y valores de tipo ArrayList de
	 * Materias. HashMap es una clase que implementa la interfaz java.util.Map
	 */
	private HashMap<Alumno, ArrayList<Materia>> alumnosMaterias;

	private HashMap<Materia, ArrayList<Alumno>> materiaAlumnos;

	/*
	 * Este es un mapa "simple" que guarda un String y utiliza el tipo de dato Long
	 * para la clave. En General, se puede usar cualquier tipo de dato para la clave
	 * y cualquier tipo de dato para los valores a almacenar
	 */
	private HashMap<Long, String> codigoNombre;

	public static void main(String[] args) {
		PruebaColeccionesApp app = new PruebaColeccionesApp();
		// app.pruebaAlumnoMaterias(app);
		app.pruebaMateriaAlumnos(app);
	}

	private void pruebaMateriaAlumnos(PruebaColeccionesApp app) {
		/* Creamos dos Alumnos que seran las Claves para el mapa */
		Alumno alumno1 = new Alumno("Ale", "F", 1);
		Alumno alumno2 = new Alumno("Awi", "F", 1);
		Alumno alumno3 = new Alumno("Federico", "Santander", 1);
		Materia poo = new Materia("POO");
		Materia java1 = new Materia("JAVA1");
		ArrayList<Alumno> alumnosMateria1 = new ArrayList<Alumno>();
		ArrayList<Alumno> alumnosMateria2 = new ArrayList<Alumno>();

		alumnosMateria1.add(alumno1);
		alumnosMateria1.add(alumno2);

		alumnosMateria2.add(alumno3);

		HashMap<Materia, ArrayList<Alumno>> mateAlumnos = new HashMap<Materia, ArrayList<Alumno>>();
		mateAlumnos.put(poo, alumnosMateria1);
		mateAlumnos.put(java1, alumnosMateria2);
		setMateriaAlumnos(mateAlumnos);
		ColeccionesUtil.imprimirMapaToString(app.getMateriaAlumnos());
	}

	private void pruebaAlumnoMaterias(PruebaColeccionesApp app) {
		/* Creamos dos Alumnos que seran las Claves para el mapa */
		Alumno alumno1 = new Alumno("Ale", "F", 1);
		Alumno alumno2 = new Alumno("Awi", "F", 1);
		/* Creamos una lista de materias */
		ArrayList<Materia> listaMaterias1 = new ArrayList<Materia>();
		listaMaterias1.add(new Materia("POO"));
		listaMaterias1.add(new Materia("LP1"));

		ArrayList<Materia> listaMaterias2 = new ArrayList<Materia>();
		listaMaterias2.add(new Materia("POO"));
		listaMaterias2.add(new Materia("LP1"));
		listaMaterias2.add(new Materia("JAVA1"));
		/*
		 * Guardamos en el mapa de nuestra aplicación de pruebas, para ambas Alumnos, la
		 * misma lista de materias
		 */
		app.getAlumnosMaterias().put(alumno1, listaMaterias1);
		app.getAlumnosMaterias().put(alumno2, listaMaterias2);
		/* Aquí guardamos un valor en el mapa "simple" */
		app.getCodigoNombre().put(10l, "Curso POO y Java");
		/* Imprimimos la lista de materias por alumno */
		ColeccionesUtil.imprimirMapa(app.getAlumnosMaterias());
		/* Utilizamos la impresión genérica de cualquier tipo de Mapa */
		ColeccionesUtil.imprimirMapaToString(app.getAlumnosMaterias());
	}

	public PruebaColeccionesApp() {
		alumnosMaterias = new HashMap<Alumno, ArrayList<Materia>>();
		materiaAlumnos = new HashMap<Materia, ArrayList<Alumno>>();
		codigoNombre = new HashMap<Long, String>();
	}

	public void setCodigoNombre(HashMap<Long, String> codigoNombre) {
		this.codigoNombre = codigoNombre;
	}

	public HashMap<Long, String> getCodigoNombre() {
		return codigoNombre;
	}

	public void setAlumnosMaterias(HashMap<Alumno, ArrayList<Materia>> alumnosMaterias) {
		this.alumnosMaterias = alumnosMaterias;
	}

	public HashMap<Alumno, ArrayList<Materia>> getAlumnosMaterias() {
		return alumnosMaterias;
	}

	public HashMap<Materia, ArrayList<Alumno>> getMateriaAlumnos() {
		return materiaAlumnos;
	}

	public void setMateriaAlumnos(HashMap<Materia, ArrayList<Alumno>> materiaAlumnos) {
		this.materiaAlumnos = materiaAlumnos;
	}

}
