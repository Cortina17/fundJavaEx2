package lambas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestLambdas {

	public static void main(String[] args) {
		// ejemplo1();
		// ejemplo2();
		ejemplo3();
	}

	public static void ordenar(List<Pais> list) {
		Collections.sort(list, new Comparator<Pais>() {

			@Override
			public int compare(Pais p1, Pais p2) {
				return p1.nombre.compareTo(p2.nombre);
			}
		});
	}

	public static void ordenarLambdas() {
	}

	public static void ejemplo3() {
		// ordenar listas cib expresiones lambdas
		// comparar el nombre de dos paises

		Pais pais1 = new Pais("Iceland");
		Pais pais2 = new Pais("Peru");
		Pais pais3 = new Pais("Canada");
		Pais pais4 = new Pais("New Zeland");
		Pais pais5 = new Pais("Japan");

		List<Pais> paises = new ArrayList<Pais>();
		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		paises.add(pais4);
		paises.add(pais5);

		paises.forEach((p) -> {
			System.out.print(p.nombre + ", ");
		});
		System.out.println("sin orden");

		ordenar(paises);
		paises.forEach((p) -> {
			System.out.print(p.nombre + ", ");
		});
		System.out.println("ordenados");

	}

	public static void ejemplo2() {
		// uso de interfaz Consumer para almacenar una expresion lambda en una variable
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(13);
		numeros.add(33);
		numeros.add(63);
		numeros.add(93);
		numeros.add(123);
		Consumer<Integer> metodo = (n) -> {
			System.out.println(n);
		};
		numeros.forEach(metodo);
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
