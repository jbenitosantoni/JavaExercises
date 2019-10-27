package strings;

import java.util.Scanner;

public class Page2Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombres[] = new String[50];
		String resultado = "";
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce nombre");
			nombres[i] = sc.nextLine();
		}
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].length() >= 2) {
				resultado = resultado + nombres[i].charAt(2);
			}
		}
		sc.close();
	}

}
