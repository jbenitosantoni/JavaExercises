package arrays;

import java.util.Scanner;

public class Page2Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Lectura de un array de 30 elementos enteros.");
		System.out.println("2. Sumatoria de los elementos del array,");
		System.out.println("3. Listado de los elementos del array");
		System.out.println("4. Encontrar elelemento máximo del array");
		System.out.println("5. Encontrar el elemento mínimo del array");
		System.out.println("6. Encontrar el rango");
		System.out.println("7. Obtener la media de los elementos del array");
		int elementos[] = new int[30];
		int intro = sc.nextInt();
		int suma = 0;
		switch (intro) {
		case 1:
			for (int i = 0; i < elementos.length; i++) {
				elementos[i] = sc.nextInt();
			}
		case 2:
			for (int i = 0; i < elementos.length; i++) {
				suma = suma + elementos[i];
			}
		case 3:
			for (int i = 0; i < elementos.length; i++) {
				System.out.print(elementos + ", ");
			}
		case 4:
			int numeromayor = elementos[1];
			for (int i = 0; i < elementos.length; i++) {
				if (elementos[i+1] > elementos[i]) {
					numeromayor = elementos[i+1];
				}
			}
		case 5:
			int numeromenor = elementos[1];
			for (int i = 0; i < elementos.length; i++) {
				if (elementos[i+1] < elementos[i]) {
					numeromenor = elementos[i+1];
				}
			}
		case 6:
			numeromayor = elementos[1];
			numeromenor = elementos[1];
			for (int i = 0; i < elementos.length; i++) {
				if (elementos[i+1] > elementos[i]) {
					numeromayor = elementos[i+1];
				}
			}
			for (int i = 0; i < elementos.length; i++) {
				if (elementos[i+1] < elementos[i]) {
					numeromenor = elementos[i+1];
				}
			}
			System.out.print("Elemento max: " + numeromayor + "\nElemento min: " + numeromenor);
		case 7:
			int media = 0; 
			for (int i = 1; i < elementos.length; i++) {
				media = media + elementos[i];
			}
			media = media / elementos.length;
		}
		sc.close();
	}

}
