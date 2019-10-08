package bucles_general;

import java.util.Scanner;

public class Page1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		int casi = 0;
		int aprobado = 0;
		int suspenso = 0;
		for (int i = 0; i < 66; i++) {
			System.out.println("Introduce nota");
			nota = sc.nextInt();
			if (nota < 4) {
				suspenso++;
			} else if (nota > 4 && nota < 5) {
				casi++;
			} else {
				aprobado++;
			}
		}
		System.out.print("Suspensos: " + suspenso + "\nCasi aprobados: " + casi + "\nAprobados: " + aprobado);
	}

}
