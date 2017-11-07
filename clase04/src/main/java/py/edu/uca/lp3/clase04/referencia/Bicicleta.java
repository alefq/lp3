package py.edu.uca.lp3.clase04.referencia;

public class Bicicleta {

	public static void main(String[] args) {
		Bicicleta bici = new Bicicleta();
		bici.setVelocidad(10);
		bici.velocidad = 0;
	}
	/*
	 * El modificador "friendly" significa que no se colocó ningún modificador
	 * de acceso. Tiene los mismos niveles que "protected"
	 */
	Integer cambios;
	/*
	 * Los campos y métodos con "private" sólo pueden ser accedidos en el scope
	 * de definición de la clase
	 */
	private String marca;
	/*
	 * Los campos protected pueden aser accedidos o modificados desde el mismo
	 * paquete, la misma clase o las clases hijas
	 */
	protected Double radioRueda;

	private int velocidad;

	protected void acelerar() {
		setVelocidad(getVelocidad() + 1);
		System.out.println("Velocidad aumentada a: " + getVelocidad());
	}

	public void cambiarVelocidad(int i) {
		// TODO Auto-generated method stub

	}

	public void frenar() {
		frenar(0);
	}

	// public int frenar()
	// {
	//
	// }

	public void frenar(int velocidadFinal) {
		frenar(0, null, null);
	}

	public void frenar(int velocidadFinal, Integer x, Integer y) {
		if (x != null && y != null) {
			/* si estoy en terreno resbaladizo*/
		} else {

			while (velocidad > velocidadFinal)
				velocidad--;
		}
	}

	public void frenarGolpe() {
		setVelocidad(0);
	}

	public String getMarca() {
		if (marca == null)
			inicializarMarca();
		return marca;
	}

	public String getMarcaGrip() {
		// TODO Auto-generated method stub
		return null;
	}

	public Double getRadioRueda() {
		return radioRueda;
	}

	public int getVelocidad() {
		return velocidad;
	}

	private void inicializarMarca() {
		setMarca("SIN MARCA");
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setRadioRueda(Double radioRueda) {
		this.radioRueda = radioRueda;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}