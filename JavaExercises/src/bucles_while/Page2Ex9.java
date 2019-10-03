package bucles_while;

import java.util.Scanner;

public class Page2Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int numero = sc.nextInt();
		while (numero != 1) {
			numero--;
			System.out.println(numero);
		}
		sc.close();
	}

}
