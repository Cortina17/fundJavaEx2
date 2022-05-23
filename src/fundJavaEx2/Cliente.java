package fundJavaEx2;

public class Cliente {

	private String nombre;
	private String apellido;
	private Cuenta nCuenta;

	public Cliente() {
	};

	public Cliente(String nombre, String apellido, Cuenta nCuenta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nCuenta = nCuenta;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
