package examen2;

public class Ejercicio2 {

	public static void main(String[] args) {
		int numeros[] = { 2, 1, 5, 45, 32, 12, 100, 13, 42, 88, 99, 65, 45, 33 };
		int alreves[] = new int[numeros.length];
		int contador = 0;
		for (int i = numeros.length - 1; i >= 0; i--) {
			alreves[contador] = numeros[i];
			contador++;
		}
	}

}
