package ar.unrn.modelo;

public class Tarjeta {

	private String numero;
	private int pin;

	public Tarjeta(String numero, int pin) {
		this.numero = numero;
		this.pin = pin;
	}

	public String obtenerNumero() {
		return numero;
	}

	public int obtenerPin() {
		return pin;
	}

}
