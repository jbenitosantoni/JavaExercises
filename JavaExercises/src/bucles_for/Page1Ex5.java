package bucles_for;

import java.util.Scanner;

public class Page1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayoresedad = 0;
		int menoresedad = 0;
		int jubilados = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduce tu edad");
			int edad = sc.nextInt();
			if (edad >= 18 && edad < 67) {
				mayoresedad++;
			} else if (edad < 18) {
				menoresedad++;
			} else if (edad >= 67) {
				jubilados++;
			}
		}
		sc.close();
		System.out.println("Hay " + mayoresedad + " mayores de edad, " + menoresedad + " menores de edad y " + jubilados
				+ " jubilados.");
	}

}
