package bucles_for;

import java.util.Scanner;

public class Page1Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nueve = 0;
		for (int i = 0; i < 20; i++) {
			System.out.println("Introduce un numero entero");
			int num = sc.nextInt();
			if (num == 9) {
				nueve++;
			}
		}
		System.out.println("Hay " + nueve + " nueves.");
		sc.close();
	}

	}
