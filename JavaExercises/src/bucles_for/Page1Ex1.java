package bucles_for;

import java.util.Scanner;

public class Page1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce un nombre");
		String nombre = sn.nextLine();
		System.out.println("Introduce un número mayor de 0");
		for (int i = sc.nextInt(); i > 0; i--) {
			System.out.println(nombre);
		}
		sc.close();
		sn.close();
	}

}
