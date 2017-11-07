package py.edu.uca.lp3.clase03;

import py.edu.uca.lp3.clase02.Auto;

public class MateriaApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        MateriaApp aplicacion = new MateriaApp();
        System.out.println("Transporte Algoritmia: "
                + aplicacion.getAlgoritmia().getTransporte().getMarca());
        System.out.println("Codigo: " + aplicacion.getAlgoritmia().getCodigo());
        System.out.println("Transporte Java1: "
                + aplicacion.getMateriaLp3().getTransporte().getMarca());
        System.out.println("Codigo: " + aplicacion.getMateriaLp3().getCodigo());

    }
    private Materia algoritmia;

    private Materia materiaLp3;

    public MateriaApp() {
        algoritmia = new Materia("LP1");
        materiaLp3 = new Materia("LP3");
        materiaLp3.getTransporte().setMarca("Honda");
        materiaLp3.setTransporte(new Auto());
        algoritmia.getTransporte().setMarca("Toyota");
        materiaLp3.getTransporte().setMarca("Hyundai");


    }

    public Materia getAlgoritmia() {
        return algoritmia;
    }

    public Materia getMateriaLp3() {
        return materiaLp3;
    }

    public void setAlgoritmia(Materia algoritmia) {
        this.algoritmia = algoritmia;
    }

    public void setMateriaLp3(Materia java1) {
        this.materiaLp3 = java1;
    }

}
