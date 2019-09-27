package switches;

import java.util.Scanner;

public class Page1Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Hombre");
		System.out.println("2. Mujer");
		int intro = sc.nextInt();
		System.out.println("Peso kg");
		double peso = sc.nextDouble();
		System.out.println("Altura cm");
		double altura = sc.nextDouble();
		System.out.println("Edad");
		double edad = sc.nextDouble();
		switch (intro) {
		case 1:
			System.out.print((10 * peso) + (6.25 * altura) - (5 * edad) + 5);
			break;
		case 2:
			System.out.print((10 * peso) + (6.25 * altura) - (5 * edad) - 161);	
			break;
		}
		sc.close();
	}

}
