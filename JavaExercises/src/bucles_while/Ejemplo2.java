package bucles_while;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		double sueldo = 0;
		int contador = 0;
		double sueldototal = 0;
		while (i < 500) {
			System.out.println("Introduce sueldo");
			sueldo = sc.nextDouble();
			if (sueldo > 1000) {
				contador++;
			}
			i++;
			sueldototal = sueldototal + sueldo;
		}
		System.out.print("Hay " + contador + " personas que cobran mas de 1000 EUR"
				+ " y la suma de todos los sueldos es " + sueldototal);
		sc.close();
	}

}