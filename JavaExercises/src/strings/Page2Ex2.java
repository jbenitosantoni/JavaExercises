package strings;

import java.util.Scanner;

public class Page2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce Frase");
		String frase = sc.nextLine();
		frase = frase.substring(0, 1).toUpperCase() + frase.substring(1) + frase.substring(1, frase.length() - 1)
				+ frase.substring(frase.length() - 1).toUpperCase();
		System.out.println(frase);
		sc.close();
	}

}
