package arrays;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		for (int i = nombre.length()-1; i >= 0; i--) {
			System.out.print(nombre.charAt(i));
		}
		sc.close();
	}

}
