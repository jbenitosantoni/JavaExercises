package strings;

import java.util.Scanner;

public class Page3Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String texto = sc.nextLine();
		char letras[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'y', 'z' };
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length() - 1; i++) {
			for (int j = 0; j < letras.length; j++) {
				if (texto.charAt(i) == letras[j]) {
					letras[j] = '\u0000';
				}
			}
		}
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}

	}

}
