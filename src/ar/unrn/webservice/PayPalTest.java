package ar.unrn.webservice;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.modelo.PagoOnline;

public class PayPalTest implements PagoOnline {

	private List<String> listaPago = new ArrayList<>();

	@Override
	public void ejecutarPago(float monto, String numero, int pin) {
		listaPago.add(numero);
	}

	public boolean verificarPago(String numero) {
		for (String number : this.listaPago) {
			if (number.equals(numero)) {
				return true;
			}
		}
		return false;
	}
}