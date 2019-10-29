package strings;

import java.util.UUID;

public class Page3Ex2 {

	public static void main(String[] args) {
		String frase = "";
		int contador = 0;
		for (int i = 0; i < 5; i++) {
			frase = UUID.randomUUID().toString();
		}
		frase = frase.replaceAll("-", "");
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " palabras.");
	}

}
