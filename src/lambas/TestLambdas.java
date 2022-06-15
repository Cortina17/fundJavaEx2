package lambas;

import java.util.ArrayList;
import java.util.Arrays;

public class TestLambdas {

	public static void main(String[] args) {
		ejemplo1();
	}

	public static void ejemplo1() {
		// antes
		for (Integer numero : Arrays.asList(2, 4, 6, 8, 10)) {
			System.out.println(numero + " ");
		}
		System.out.println();

		// con lambdas
		Arrays.asList(1, 3, 5, 7, 9).forEach(n -> System.out.println(n + " "));
		System.out.println();

		// otra forma
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(15);
		numeros.add(25);
		numeros.forEach((n) -> System.out.println(n + " "));
		System.out.println();
		numeros.forEach(System.out::println);
	}
}
