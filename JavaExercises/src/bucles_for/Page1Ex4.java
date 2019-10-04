package bucles_for;

import java.util.Scanner;

public class Page1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu veces");
		int veces = 4 * sc.nextInt();
		for (int i = veces; i > 0; i++) {
			System.out.println("We Love Centro Nelson");
		}
		sc.close();
	}

}
