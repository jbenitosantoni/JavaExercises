package bucles_general;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce veces a repetir");
		int numero = sc.nextInt();
		for (int i = 0; i < numero; i++) {
			System.out.println("Eco…");
		}
		sc.close();
	}

}
