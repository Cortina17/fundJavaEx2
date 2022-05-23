package fundJavaEx2;

import java.util.ArrayList;
import java.util.List;

public class TestBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuentaAhorro = new CajaDeAhorro("941", 100);

		Cuenta cuentaCorriente = new CuentaCorriente("1033", 25, 14);
		// creamos la lista de Cuentas y añadimos cuenta de Ahorro y cuenta Corriente
		List lista = new ArrayList<Cuenta>();
		lista.add(cuentaAhorro);
		lista.add(cuentaCorriente);

		Cliente cliente = new Cliente("Juan", "Perez", lista);

		System.out.println(cliente.toString());

		System.out.println("Saldo anterior cuenta de ahorro: " + cuentaAhorro.getSaldo());

		cuentaAhorro.depositar(54);

		System.out.println("Saldo actual cuenta de ahorro: " + cuentaAhorro.getSaldo());

		CuentaCorriente cuentaCorriente1 = (CuentaCorriente) cuentaCorriente;
		System.out.println("Ultimo cheque emitido: " + cuentaCorriente1.getUltimoNumeroCheque());
		System.out.println("Saldo cuenta corriente: " + cuentaCorriente.getSaldo());
		System.out.println("****");
		if (cuentaAhorro.mover(85, cuentaCorriente1.getNumeroCuenta(), cuentaCorriente1)) {
			System.out.println(
					"Saldo cuenta corriente despues de mover de la cuenta de ahorro: " + cuentaCorriente1.getSaldo());
		} else {
			System.out.println("No pude mover los fondos");
		}

	}

}