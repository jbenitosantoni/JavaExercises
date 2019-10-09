package arrays;

import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombres[] = new String[10];
		String apellidos[] = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce tu nombre");
			nombres[i] = sc.nextLine();
			System.out.println("Introduce tu apellido");
			apellidos[i] = sc.nextLine();
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " " + apellidos[i]);
		}
		sc.close();
	}

}
