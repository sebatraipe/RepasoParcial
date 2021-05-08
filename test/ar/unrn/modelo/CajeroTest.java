package ar.unrn.modelo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ar.unrn.webservice.PayPalTest;

public class CajeroTest {

	@Test
	public void verificarPago() {

		PayPalTest payPal = new PayPalTest();
		Cajero cajeroSeba = new Cajero(payPal);
		Cajero cajeroHugo = new Cajero(payPal);

		cajeroHugo.pagar(150, new Tarjeta("295 14133378", 2174));
		cajeroSeba.pagar(100, new Tarjeta("256 56599987", 1234));

		Assert.assertTrue(payPal.verificarPago("295 14133378"));/* Verificamos que se envió el pago */
		Assert.assertFalse(payPal.verificarPago(
				"256 56599987"));/* Verificamos que no se haya enviado el pago por no cumplir la condicion */
	}

}
