package bucles_while;

import java.util.Scanner;

public class Page2Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos números enteros");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int peque = Math.min(num1, num2);
		int grande = Math.max(num1, num2);
		while (peque != grande) {
			if (peque % 2 == 0) {
				peque++;
				System.out.println(peque);
			} else {
				peque++;
			}
		}
		sc.close();
	}
}