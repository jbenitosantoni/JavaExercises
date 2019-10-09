package condicionales;

import java.util.Scanner;

public class Page2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre y apellidos");
		String nombre = sc.nextLine();
		System.out.println("Introduce sueldo base");
		double sueldo = sc.nextInt();
		System.out.println("Introduce años de antiguedad");
		int años = sc.nextInt();
		System.out.println("Introduce edad");
		int edad = sc.nextInt();
		System.out.println("Introduce numero de hijos");
		int hijos = sc.nextInt();
		sueldo = sueldo * 12;
		if (años % 5 == 0) {
			sueldo = sueldo + ((años / 5) * 45 * 12);
		} else if (hijos > 2) {
			sueldo = sueldo + 100 * 4;
		} else if (hijos == 0) {
			sueldo = sueldo - 50;
		} else if (edad > 50 && edad < 60) {
			sueldo = sueldo * 1.1 * 12;
		}
		
		double sueldomes = sueldo / 12;
		double sueldoneto = sueldo * 0.81;
		double sueldomesneto = sueldomes * 0.81;
		System.out.print("El sueldo Bruto anual es de: " + sueldo + "\nEl sueldo Bruto mensual es de: " + sueldomes
				+ "\nEl sueldo Neto anual es de: " + sueldoneto + "\nEl sueldo Neto mensual es de: " + sueldomesneto);

	}

}
