package py.edu.uca.lp3.clase02;

public class Auto {
	/* Definimos las propiedades para nuestra clase */
	int anyo;
	String marca;
	String modelo;
	int velocidad;

	public Auto() {
		setMarca("Sin marca");
	}
	
	void acelerar() {
		velocidad++;
	}

	/*
	 * Definimos un método. Los métodos se recomienda que expresen una acción,
	 * con el infinitivo o por ejemplo getAlgo setAlgo
	 */
	/**
	 * Se arranca el motor del auto y se coloca la velocidad a 0
	 * */
	public void arrancar() {
		System.out.println("Arrancando");
	}

	public int getAnyo() {
		return anyo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setAnyo(int anho) {
		this.anyo = anho;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


}
