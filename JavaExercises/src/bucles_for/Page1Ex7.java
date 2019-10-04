package bucles_for;

import java.util.Scanner;

public class Page1Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nueve = 0;
		int nonueve = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduce un numero entero");
			int num = sc.nextInt();
			if (num == 9) {
				nueve++;
			} else {
				nonueve++;
			}
		}
		System.out.println("Hay " + nueve + " nueves y " + nonueve + " no nueves.");
		sc.close();
	}

}
