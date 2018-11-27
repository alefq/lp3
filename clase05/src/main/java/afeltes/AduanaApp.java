package afeltes;

import afeltes.exceptions.TooLittleException;
import afeltes.exceptions.TradingException;
import py.edu.uca.lp3.clase04.interfaces.Cotizable;

public class AduanaApp {

	public static void main(String[] args) {

		AduanaApp aduanaApp = new AduanaApp();

		Producto yerba = new Producto();
		Servicio desarrolloSoftware = new Servicio();

		yerba.setIdentificacion("Yerba mate");
		desarrolloSoftware.setIdentificacion("Programación SQL");

		yerba.setPeso(new Double(0.0001));
		desarrolloSoftware.setHoras(new Double(10));

		yerba.setPrecio(new Double(20000));
		desarrolloSoftware.setPrecio(new Double(15));

		try {
			aduanaApp.mostrarCotizacion(yerba);
			aduanaApp.mostrarCotizacion(desarrolloSoftware);

		} catch (TradingException e) {
			System.out.println("Ocurrio un problema: " + e.getMessage());
			System.out.println("Favor contactar con: " + e.getManager().getNombre());
			e.printStackTrace();
		}

		aduanaApp.mostrarCotizacion(yerba, yerba.getIdentificacion());
	}

	public void mostrarCotizacion(Cotizable cotizable, String identificador) {
		System.out.println("Precio: " + cotizable.getPrecio(identificador));
	}

	public void mostrarCotizacion(Item item) throws TradingException {

		if (item instanceof Producto) {
			Producto producto = (Producto) item;
			if (producto.getPeso() < TooLittleException.MIN_WEIGHT) {

			}
		}

		System.out.println(String.format("Precio de %s es %s", item.getIdentificacion(), item.getPrecio()));
		mostrarCotizacion(item, item.getIdentificacion());
	}

	public void mostrarCotizacion(Producto producto) throws TradingException {

		if (producto.getPeso() < TooLittleException.MIN_WEIGHT) {
			throw new TooLittleException("No se permite cotizar el peso: " + producto.getPeso()
					+ ", el peso mínimo permitido es " + TooLittleException.MIN_WEIGHT);
		}

		System.out.println(String.format("Precio de %s es %s", producto.getIdentificacion(), producto.getPrecio()));
		mostrarCotizacion(producto, producto.getIdentificacion());
	}

}
