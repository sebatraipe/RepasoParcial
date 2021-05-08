package ar.unrn.modelo;

public interface PagoOnline {

	void ejecutarPago(float monto, String numero, int pin);
}
