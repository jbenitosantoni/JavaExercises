package condicionales;

import java.util.Scanner;

public class Page3Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre");
		String nombre = sc.nextLine();
		System.out.println("Edad");
		int edad = sc.nextInt();
		String manuel = "Manuel";
		if (nombre.contentEquals(manuel) && edad >= 30) {
			System.out.print("Enhorabuena!");
		} else {
			System.out.print("Lo sentimos...");
		}

	}

}
