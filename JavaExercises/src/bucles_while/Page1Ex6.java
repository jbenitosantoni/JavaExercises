package bucles_while;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int diez = 0;
		int cero = 0;
		int numero = 0;
		while (i < 20) {
			System.out.println("Introduce número entero");
			numero = sc.nextInt();
			i++;
			if (numero == 10) {
				diez++;
			} else if (numero == 0) {
				cero++;
			}
		}
		System.out.println("Se han introducido " + diez + " dieces y " + cero + " ceros.");
		sc.close();
	}

}
