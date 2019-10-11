package arrays;

import java.util.Scanner;

public class Page3Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero");
		int numero = sc.nextInt();
		int uno[] = new int[numero];
		for (int i = 0; i < uno.length; i++) {
			uno[i] = sc.nextInt();
		}
		for (int i = 0; i < uno.length; i++) {
			System.out.print("\n");
			for (int b = uno[i]; b > 0; b--) {
				System.out.print("*");
			}
		}

	}

}
