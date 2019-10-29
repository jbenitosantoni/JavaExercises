package strings;

import java.util.Scanner;

public class Page3Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa texto");
		int contadorcorta = 0;
		int contadorlarga = 0;
		int contador = 0;
		String texto = sc.nextLine();
		for (int i = 0; i < texto.length(); i++) {
			contador++;
			if (texto.charAt(i) == ' ') {
				if (contador < 5) {
					contadorcorta++;
					contador = 0;
					
				} else if (contador >= 5){
					contadorlarga++;
					contador = 0;
				}
			}
		}
		System.out.println("Largas: " + contadorlarga + " - Cortas: " + contadorcorta);
		sc.close();
	}
}