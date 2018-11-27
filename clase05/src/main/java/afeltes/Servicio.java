package afeltes;

public class Servicio extends Item {

	private Double horas;

	public Double getHoras() {
		return horas;
	}

	public void setHoras(Double horas) {
		this.horas = horas;
	}

	@Override
	public Long getPrecio(String identificador) {
		Double precioDouble = getPrecio() * getHoras();
		return precioDouble.longValue();
	}

}
