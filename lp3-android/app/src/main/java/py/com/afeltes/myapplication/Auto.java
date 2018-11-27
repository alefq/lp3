package py.com.afeltes.myapplication;

/**
 * Created by afeltes on 26/10/17.
 */

public class Auto extends Object {
    int anho;
    String marca;
    String modelo;
    int velocidad;
    void arrancar(){
        System.out.println("Arrancando");
    }
    void acelerar(){
        velocidad++;
    }
    void frenar(){
        velocidad=0;
    }
}
