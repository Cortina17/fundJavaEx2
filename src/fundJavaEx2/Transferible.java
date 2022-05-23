package fundJavaEx2;

public interface Transferible {
	
	public void depositar(double cant);

	public void extraer(double cant);

	public void mover(double cant, int nroCuenta);
}
