package strings;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre");
		String nombre = sc.nextLine();
		System.out.println("Apellidos");
		String apellidos = sc.nextLine();
		System.out.println("DNI");
		String dni = sc.nextLine();
		String datos = nombre + " - " + apellidos + " - " + dni;
		System.out.println(datos);
		sc.close();
	}

}
