package bucles_while;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int i = 0;
		String nombre = "";
		double sueldo = 0;
		double media = 0;
		while (i < 10) {
			System.out.println("Introduce nombre");
			nombre = sn.nextLine();
			System.out.println("Introduce sueldo");
			sueldo = sc.nextDouble();
			if (sueldo > 500) {
				System.out.println(nombre + " cobra mas de 500 EUR");
			}
			i++;
			media = sueldo + media;
		}
		System.out.println("La media es: " + media / 10);
		sc.close();
		sn.close();
	}

}
