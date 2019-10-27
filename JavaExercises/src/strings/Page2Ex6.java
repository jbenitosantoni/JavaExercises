package strings;

import java.util.Scanner;

public class Page2Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String paises[] = new String[20];
		int contador = 0;
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Introduce pais");
			paises[i] = sc.nextLine();
		}
		for (int i = 0; i < paises.length; i++) {
			for (int j = 0; j < paises[i].length(); j++) {
				if (paises[i].charAt(i) == 'e') {
					contador++;
				}
			}
		}
		System.out.println(contador);
		sc.close();
	}

}
