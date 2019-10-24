package examen2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// El tamaño es el mas optimo para esta cantidad de numeros
		int numeros[][] = new int[19][20];
		// Contador para las filas del array
		int contador = 0;
		// Contador para las columnas del array
		int contador2 = 0;
		// Numeros Pares excluyendo 800 y 200
		for (int i = 800 - 1; i > 200; i--) {
			if (i % 2 == 0) {
				numeros[contador][contador2] = i;
				contador++;
				if (contador == numeros.length) {
					contador2++;
					// Reseteamos filas al llegar al maximo que puede almacenar una columna
					contador = 0;
				}
			}
		}
		
		// Numeros impares excluyendo 100 y 5
		for (int i = 100 - 1; i > 5; i--) {
			if (i % 2 != 0) {
				numeros[contador][contador2] = i;
				contador++;
				if (contador == numeros.length) {
					contador2++;
					contador = 0;
				}
			}
		}

	}

}
