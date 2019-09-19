package Day1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre");
		String nombre = sc.nextLine();
		System.out.println("Sueldo");
		double sueldo = sc.nextDouble();
		System.out.println("Hijos");
		double hijos = sc.nextDouble();
		System.out.println("Familiares a cargo");
		double familiares = sc.nextDouble();
		double csueldo = (sueldo + 50 * hijos + 100 * familiares) * 12;
		System.out.print("El sueldo anual de " + nombre + " es: " + csueldo + " EUR");
	}

}
