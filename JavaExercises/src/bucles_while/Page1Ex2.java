package bucles_while;

import java.util.Scanner;

public class Page1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int nueve = 0;
		int nonueve = 0;
		double numero = 0;
		while (i < 20) {
			System.out.println("Introduce número");
			numero = sc.nextDouble();
			i++;
			if (numero == 9) {
				nueve++;
			} else {
				nonueve++;
			}
		}
		System.out.println("Se han introducido " + nueve + " nueves y " + nonueve + " números que no son nueve.");
		sc.close();
	}

}
