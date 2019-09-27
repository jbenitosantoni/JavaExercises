package switches;

import java.util.Scanner;

public class Page1Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		if (nombre.contentEquals("Antonio")) {
			System.out.print("Normalito");
		} else if (nombre.contentEquals("Enrique")) {
			System.out.print("Resultón");
		} else if (nombre.contentEquals("Raúl")) {
			System.out.print("Del montón");
		} else if (nombre.contentEquals("Rafael")) {
			System.out.print("puffff...");
		} else if (nombre.contentEquals("José")) {
			System.out.print("Guapete");
		} else if (nombre.contentEquals("Jorge")) {
			System.out.print("Tremendamente atractivo");
		}
		sc.close();
	}

}
