package arrays;

import java.util.Scanner;

public class Page2Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String nombre[] = new String[20];
		double sueldo[] = new double[20];
		String nombreganador = "";
		double sueldoganador = 0;
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Introduce nombre");
			nombre[i] = sn.nextLine();
			System.out.println("Introduce sueldo");
			sueldo[i] = sc.nextDouble();
		}
		for (int i = 1; i < nombre.length; i++) {
			if (sueldo[i] > sueldo[i - 1]) {
				nombreganador = nombre[i];
				sueldoganador = sueldo[i];
			}
		}
		System.out.print("El sueldo mas alto es: " + sueldoganador + " y pertenece a " + nombreganador);
		sc.close();
		sn.close();
	}
}
