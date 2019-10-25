package strings;

import java.util.Scanner;

public class Page1Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombres[] = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce nombre");
			nombres[i] = sc.nextLine();
		}
		for (int i = 0; i < nombres.length; i++) {
			nombres[i].replace("a", "x");
			nombres[i].replace("A", "x");
			nombres[i].replace("O", "0");
			nombres[i].replace("o", "0");
		}
		sc.close();
	}

}
