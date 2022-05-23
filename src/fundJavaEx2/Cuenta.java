package fundJavaEx2;

public class Cuenta implements Transferible {

	private String numeroCuenta;
	private double saldo;

	public Cuenta(String numeroCuenta, double saldo) {

		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double depositar(double cantidad) {
		this.saldo = this.saldo + cantidad;
		return this.saldo + cantidad;
	}

	@Override
	public void extraer(double cantidad) throws SobreGiroException {
		if (cantidad < saldo) {
			setSaldo(getSaldo() - cantidad);
		} else {
			throw new SobreGiroException("Fondos insuficientes, con un deficit de " + (getSaldo() - cantidad));
		}
	}

	@Override
	public boolean mover(double cantidad, String numeroCuenta, Cuenta cuenta) {
		if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
			cuenta.setSaldo(cuenta.getSaldo() + cantidad);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Cuenta con el numero " + numeroCuenta + " tiene un saldo de " + saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

}
