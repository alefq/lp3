package afeltes;

import py.edu.uca.lp3.clase04.interfaces.Cotizable;

public abstract class Item implements Cotizable {
	private String identificacion;
	private Double precio;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
