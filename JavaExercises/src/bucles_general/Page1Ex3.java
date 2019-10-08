package bucles_general;

import java.util.Scanner;

public class Page1Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int calificacion = 0;
		int suspensos = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce calificación");
			calificacion = sc.nextInt();
			if (calificacion < 5) {
				suspensos++;
			}
		}
		System.out.println("Hay " + suspensos + " suspensos.");
		sc.close();
	}

}
