package py.edu.uca.lp3.clase03;

import py.edu.uca.lp3.clase02.Alumno;
import py.edu.uca.lp3.clase02.Auto;
import py.edu.uca.lp3.clase02.Profesor;

public class Materia {
    /*
     * Definimos una clase nueva, la convención determina que la primera letra
	 * debe ser mayúscula y el resto ya es a elección, mezcla de letras y
	 * números. Debe definirse dentro del archivo, por lo menos la clase con el
	 * mismo nombre del archivo que la contiene.
	 */

    public static void describirMateria() {

    }

    /*
     * El método main con esta firma convierte a esta clase Java en una
     * aplicación Java, es decir puede ejecutarse directamente
     */
    public static void main(String[] args) {
		/*
		 * La clase System es parte del JRE y contiene un campo de tipo
		 * PrintStream para imprimir en la consola. Al utilizar directamente un
		 * string entre comillas, por detrás se instancia un objeto de tipo
		 * String
		 */
        System.out.println(new String("Hello World!"));
        Materia lp3 = new Materia();
        lp3.inicializarMateria();

        System.out.println("Alumno: " + lp3.getAlumno().getNombre());
        System.out.println("Profesor: " + lp3.getProfesor().getNombre());
    }

    private Alumno alumno;

    private String codigo;

    private Profesor profesor;

    /*
     * Para la clase01 declaramos con el modificador static para poder
	 * utilizarlo dentro del método main
	 */
    private Auto transporte;

    public Materia() {
        // TODO Auto-generated constructor stub
    }

    public Materia(String codigo) {
        setCodigo(codigo);
        inicializarMateria();
    }
    public Alumno getAlumno() {
        return alumno;
    }
    public String getCodigo() {
        return codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param args
     */
    public Auto getTransporte() {
        return transporte;
    }

    public void inicializarMateria() {
        Auto auxilio = new Auto();
		/* Creamos una nueva instancia de la clase Auto */
        setTransporte(new Auto());
		/* Enviamoe el mensaje de arrancar a la clase recientemente creada */
        getTransporte().arrancar();

        setAlumno(new Alumno());
        setProfesor(new Profesor());

        getAlumno().setNombre("Bart");
        getProfesor().setNombre("Xavier");
        getAlumno().setNumeroMatricula(1);
    }

    public void setAlumno(Alumno pAlumno) {
        alumno = pAlumno;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProfesor(Profesor pProfesor) {
        profesor = pProfesor;
    }

    public void setTransporte(Auto pTransporte) {
        transporte = pTransporte;
    }

}
