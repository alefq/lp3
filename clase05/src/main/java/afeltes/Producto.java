package afeltes;

public class Producto extends Item {

	private Double peso;

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public Long getPrecio(String identificador) {
		Double precioDouble = getPrecio() * getPeso();
		return precioDouble.longValue();
	}

}
