package examen1;

import java.util.Scanner;

public class N5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Sumar dos números.");
		System.out.println("2. Restar dos números.");
		System.out.println("3. Multiplicar dos números.");
		System.out.println("4. Dividir dos números.");
		System.out.println("5. Salir.");
		int entrada = sc.nextInt();
		switch (entrada) {
		case 1:
			System.out.println("Introduce dos números");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println("Introduce dos números");
			double num3 = sc.nextDouble();
			double num4 = sc.nextDouble();
			System.out.println(num3 - num4);
			break;
		case 3:
			System.out.println("Introduce dos números");
			double num5 = sc.nextDouble();
			double num6 = sc.nextDouble();
			System.out.println(num5 * num6);
			break;
		case 4:
			System.out.println("Introduce dos números");
			double num7 = sc.nextDouble();
			double num8 = sc.nextDouble();
			System.out.println(num7 / num8);
			break;
		case 5:
			System.out.println("Saliendo...");
			break;
		}
		sc.close();
	}

}
