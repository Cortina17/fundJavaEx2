package fundJavaEx2;

public interface Transferible {
	
	public double depositar(double cantidad);

	public void extraer(double cantidad) throws SobreGiroException;

	public boolean mover(double cantidad, String numeroCuenta, Cuenta cuenta);

}
