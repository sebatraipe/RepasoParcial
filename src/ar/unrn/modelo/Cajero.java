package ar.unrn.modelo;

public class Cajero {

	private PagoOnline pagoOnline;

	public Cajero(PagoOnline pagoOnline) {
		this.pagoOnline = pagoOnline;
	}

	public void pagar(float monto, Tarjeta tarjeta) {
		if (monto > 100) {
			pagoOnline.ejecutarPago(monto, tarjeta.obtenerNumero(), tarjeta.obtenerPin());
		}
	}
}