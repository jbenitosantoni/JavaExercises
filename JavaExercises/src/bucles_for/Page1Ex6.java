package bucles_for;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nombre");
		String nombre = sc.nextLine();
		for (int i = 0; i < 3450; i++) {
			System.out.println(nombre);
		}
		sc.close();
	}

}
