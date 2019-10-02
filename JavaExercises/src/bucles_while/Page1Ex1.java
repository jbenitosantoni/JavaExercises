package bucles_while;

import java.util.Scanner;

public class Page1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		int i = 0;
		while (i < 3450) {
			System.out.println(nombre);
			i++;
		}
		sc.close();
	}

}
