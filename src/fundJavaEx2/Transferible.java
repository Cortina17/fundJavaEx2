package fundJavaEx2;

public interface Transferible {
	
	public double depositar(double cant);

	public void extraer(double cant);

	public boolean mover(double cant, int nroCuenta, Cuenta cuenta);
}
