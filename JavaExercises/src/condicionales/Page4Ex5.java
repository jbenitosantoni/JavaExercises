package condicionales;

import java.util.Scanner;

public class Page4Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres números");
		double num1 = sc.nextDouble();
		if (num1 % 2 == 0 && num1 > 1000) {
			System.out.print("Es mi número.");
		}
		sc.close();
	}

}
