package fundJavaEx2;

public class TestExcepcionBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new CajaDeAhorro("123456789", 200);
		System.out.println(cuenta.getSaldo());
		cuenta.depositar(25);
		System.out.println(cuenta.getSaldo());
		try {
			cuenta.extraer(148.25);
		} catch (SobreGiroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// e.getMessage();
		}
		System.out.println(cuenta.getSaldo());
		try {
			cuenta.extraer(90);
		} catch (SobreGiroException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
