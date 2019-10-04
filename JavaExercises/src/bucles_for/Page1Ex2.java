package bucles_for;

import java.util.Scanner;

public class Page1Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números enteros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for (int min = Math.min(num1,num2), max = Math.max(num1, num2); max > min; min++) {
			System.out.print(min + ", ");
		}
		sc.close();
	}

}
