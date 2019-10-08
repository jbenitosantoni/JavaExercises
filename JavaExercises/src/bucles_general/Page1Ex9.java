package bucles_general;

import java.util.Scanner;

public class Page1Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int suma = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce número");
			numero = sc.nextInt();
			suma = suma + numero;
		}
		for (int i = 0; i < suma; i++) {
			System.out.println("Hello my friend");
		}
		sc.close();
	}

}
