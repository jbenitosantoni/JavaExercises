package condicionales;

import java.util.Scanner;

public class Page3Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre");
		String nombre = sc.nextLine();
		if (nombre.contentEquals("Antonio") || nombre.contentEquals("Pepe") || nombre.contentEquals("Juan")
				|| nombre.contentEquals("Carlos")) {
			System.out.println("Serás expulsado del centro");
		} else {
			System.out.print("Bienvenido");
		}
	}

}
