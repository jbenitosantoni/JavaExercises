package strings;

import java.util.Scanner;

public class Page1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu direccion");
		String direccion = sc.nextLine();
		System.out.println(nombre.length() + direccion.length());
		sc.close();
	}

}
