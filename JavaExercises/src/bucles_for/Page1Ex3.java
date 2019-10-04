package bucles_for;

import java.util.Scanner;

public class Page1Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		for (int i = edad; i > 0; i--) {
			System.out.println("Paisano");
		}
		sc.close();
	}

}
