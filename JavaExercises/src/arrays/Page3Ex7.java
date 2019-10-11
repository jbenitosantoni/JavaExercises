package arrays;

import java.util.Scanner;

public class Page3Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero[] = new int[20];
		for (int i = 0; i < numero.length; i++) {
			numero[i] = sc.nextInt();
		}
		System.out.println("Valor a buscar");
		int valor = sc.nextInt();
		int cuantosvalor = 0;
		int posicion = 0;
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == valor) {
				cuantosvalor++;
				if (numero[i] > numero[i - 1]) {
					posicion = numero[i];
				}
			}
		}
	}

}
