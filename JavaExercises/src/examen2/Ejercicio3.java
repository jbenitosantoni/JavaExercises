package examen2;

public class Ejercicio3 {

	public static void main(String[] args) {
		int comprendidos = 0;
		int contador = 0;
		// Pongo menos uno por que no quiero incluir el 1560 ya que el enunciado dice
		// entre esos dos
		for (int i = 1560 - 1; i > 200; i--) {
			if (i % 2 == 0) {
				// Calculamos el numero de numeros comprendidos entre esos dos para poder hacer
				// el array
				comprendidos++;
			}
		}
		int numeros[] = new int[comprendidos];
		// Pongo menos uno por que no quiero incluir el 1560 ya que el enunciado dice
		// entre esos dos
		for (int i = 1560 - 1; i > 200; i--) {
			if (i % 2 == 0) {
				numeros[contador] = i;
				contador++;
			}
		}
	}

}
