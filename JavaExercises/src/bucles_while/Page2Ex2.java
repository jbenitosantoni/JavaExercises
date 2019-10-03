package bucles_while;

import java.util.Scanner;

public class Page2Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int i = sc.nextInt();
		while (i != 0) {
			if (i > 0) {
				i--;
				System.out.println(i);
			} else if (i < 0) {
				i++;
				System.out.println(i);
			}
		}
		sc.close();
	}

}
