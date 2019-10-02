package bucles_while;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int positivo = 0;
		int negativo = 0;
		int mas100 = 0;
		double numero = 1;
		while (numero != 0) {
			System.out.println("Introduce un numero");
			numero = sc.nextDouble();
			i++;
			if (numero > 100) {
				mas100++;
				positivo++;
			} else if (numero >= 0) {
				positivo++;
			} else {
				negativo++;
			}
		}
		System.out.print("Mayores de 100: " + mas100 + "\nPositivos: " + positivo + "\nNegativos: " + negativo);
	}

}
