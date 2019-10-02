package bucles_while;

import java.util.Scanner;

public class Page1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int nueve = 0;
		int numero = 0;
		while (i < 20) {
			System.out.println("Introduce número entero");
			numero = sc.nextInt();
			i++;
			if (numero == 9) {
				nueve++;
			}
		}
		System.out.println("Se han introducido " + nueve + " nueves.");
		sc.close();
	}
}
