package switches;

import java.util.Scanner;

public class DayEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre y apellidos");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu sueldo");
		double sueldo = sc.nextDouble();
		System.out.println("1. Mostrar sueldo anual");
		System.out.println("2. Mostrar Finiquito");
		System.out.println("3. Salir");
		int pulsa = sc.nextInt();
		switch (pulsa) {
		case 1:
			System.out.println(nombre + ", tu sueldo anual es: " + sueldo * 12);
			break;
		case 2:
			System.out.println("Introduce numero de meses trabajados");
			int meses = sc.nextInt();
			System.out.println(nombre + ", tu finiquito es: " + meses * 0.5);
			break;
		case 3:
			System.out.println("Saliendo...");
			break;
		}
		sc.close();
	}

	}
