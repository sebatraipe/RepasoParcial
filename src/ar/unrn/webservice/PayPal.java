package ar.unrn.webservice;

import ar.unrn.modelo.PagoOnline;

public class PayPal implements PagoOnline {

	@Override
	public void ejecutarPago(float monto, String numero, int pin) {
//		Llamar al web service de PayPal...
		System.out.println("Se ejecuto el pago correctamente...");
	}
}
