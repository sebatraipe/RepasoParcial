package ar.unrn.main;

import ar.unrn.modelo.Cajero;
import ar.unrn.modelo.Tarjeta;
import ar.unrn.webservice.PayPal;

public class Main {

	public static void main(String[] args) {

		Cajero sebastian = new Cajero(new PayPal());
		sebastian.pagar(100, new Tarjeta("256 56599987", 1234));
	}
}