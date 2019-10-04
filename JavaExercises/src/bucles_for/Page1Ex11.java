package bucles_for;

import java.util.Scanner;

public class Page1Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int diez = 0;
		int cero = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduce un numero entero");
			int num = sc.nextInt();
			if (num == 10) {
				diez++;
			} else if (num == 0) {
				cero++;
			}
		}
		System.out.println("Hay " + diez + " dieces y " + cero + " ceros.");
		sc.close();

	}

}
