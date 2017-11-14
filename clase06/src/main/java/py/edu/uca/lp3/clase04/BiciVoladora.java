package py.edu.uca.lp3.clase04;

import py.edu.uca.lp3.clase04.interfaces.Volador;

/*BiciVoladora puede implementar también el método volar*/
public class BiciVoladora extends Bicicleta implements Volador {

	public void volar() {
		System.out.println("Bici volando");
	}

}
