package switches;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 4 números enteros.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		if (num1 > num2 && num1 > num3 && num1 > num4) {
			if (num2 > num4 && num3 > num4) {
				System.out.print(num2 + ", " + num3);
			} else if (num2 > num3 && num1 > num3) {
				System.out.print(num2 + ", " + num4);
			} else {
				System.out.print(num4 + ", " + num3);
			}
		} else if (num2 > num1 && num2 > num3 && num2 > num4) {
			if (num3 > num1 && num4 > num1) {
				System.out.print(num4 + ", " + num3);
			} else if (num1 > num3 && num4 > num3) {
				System.out.print(num4 + ", " + num1);
			} else {
				System.out.print(num1 + ", " + num3);
			}

		} else if (num3 > num1 && num3 > num2 && num3 > num4) {
			if (num2 > num1 && num4 > num1) {
				System.out.print(num2 + ", " + num4);
			} else if (num1 > num2 && num4 > num2) {
				System.out.print(num1 + ", " + num4);
			} else {
				System.out.print(num2 + ", " + num1);
			}
		} else {
			if (num2 > num1 && num3 > num1) {
				System.out.print(num2 + ", " + num3);
			} else if (num3 > num2 && num1 > num2) {
				System.out.print(num3 + ", " + num1);
			} else {
				System.out.print(num2 + ", " + num1);
			}
		}
		sc.close();
	}

}
