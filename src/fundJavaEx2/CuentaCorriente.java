package fundJavaEx2;

public class CuentaCorriente extends Cuenta {
	private final int id;
	private int ultimoNumeroCheque;

	public CuentaCorriente(String numeroCuenta, double saldo, int ultimoNumeroCheque) {
		super(numeroCuenta, saldo);
		this.ultimoNumeroCheque = ultimoNumeroCheque;
		this.id = 2;
	}

	public int getId() {
		return id;
	}

	public int getUltimoNumeroCheque() {
		return ultimoNumeroCheque;
	}

	@Override
	public String toString() {
		return super.toString() + " el ultimo numero de cheque es el " + ultimoNumeroCheque;
	}

}
