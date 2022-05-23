package fundJavaEx2;

public class CajaDeAhorro extends Cuenta {

	private final int id;

	public CajaDeAhorro(String numeroCuenta, double saldo) {
		super(numeroCuenta, saldo);
		this.id = 1;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}