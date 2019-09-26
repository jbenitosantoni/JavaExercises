package switches;

import java.util.Scanner;

public class Day1Ex1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Calcular IVA");
		System.out.println("2. Calcular IRPF sueldo");
		System.out.println("3. Calcular Paga Extra");
		System.out.println("4. Salir");
		int intro = sc.nextInt();
		switch (intro) {
		case 1:
			System.out.println("Introduce el precio");
			double precioiva = sc.nextDouble();
			precioiva = precioiva * 0.21;
			System.out.println( "El IVA es: " + precioiva);
			break;
		case 2:
			System.out.println("Introduce el sueldo");
			double sueldo = sc.nextDouble();
			System.out.println("Introduce IRPF");
			double irpf = sc.nextDouble();
			System.out.println( "El IRPF es: " + sueldo * (irpf / 100));
			break;
		case 3:
			System.out.println("Introduce el sueldo");
			sueldo = sc.nextDouble();
			System.out.println( "Tu paga extra es: " + sueldo * 1.25);
			break;
		case 4:
			System.out.println("Saliendo...");
			break;
		}
		sc.close();
	}

}
