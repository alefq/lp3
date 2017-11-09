package py.edu.uca.lp3.clase04.referencia;

public class Yorkshire extends Perro {

	@Override
	public void ladrar() {
		setFrecuenciaLadrido(Perro.FRECUENCIA_ALTA);
		super.ladrar();
	}
}
