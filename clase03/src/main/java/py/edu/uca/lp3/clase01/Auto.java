package py.edu.uca.lp3.clase01;

public class Auto {
    /* Definimos las propiedades para nuestra clase */
    int anho;
    String marca;
    String modelo;
    int velocidad;

    /*
     * Definimos un método. Los métodos se recomienda que expresen una acción,
     * con el infinitivo o por ejemplo getAlgo setAlgo
     */
    public void arrancar() {
        System.out.println("Arrancando");
    }

    void acelerar() {
        velocidad++;
    }
}
