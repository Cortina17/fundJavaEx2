package fundJavaEx2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private List<Cuenta> cuentas;

	public Cliente() {
		super();// ESTOY LLAMANDO AL SUPER DE OBJECT
	}

	public Cliente(String nombre, String apellido, List<Cuenta> cuentas) {
		super();// ESTOY LLAMANDO AL SUPER DE OBJECT
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "El cliente " + nombre + " " + apellido + ", tiene las cuentas=" + cuentas.toString();
	}

}
