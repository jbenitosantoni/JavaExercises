package bucles_general;

import java.util.Scanner;

public class Page1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura = 0;
		double introduccion = 0;
		int i = 0;
		while (introduccion != -1) {
			System.out.println("Introduce altura arbol en cm");
			introduccion = sc.nextDouble();
			i++;
			if (introduccion > altura) {
				altura = introduccion;
			}
		}
		System.out.println("Arbol " + i + " - " + altura + " metros");
		sc.close();
	}

}
