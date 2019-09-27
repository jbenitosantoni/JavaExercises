package switches;

import java.util.Scanner;

public class Page1Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 3 números enteros.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if ((num1 > num2 && num1 > num3) && (num3 < num2)) {
			System.out.print("A " + num2 + " le quedan " + (num1 - num2) + " unidades para llegar a " + num1
					+ " y le sobran " + (num2 - num3) + " unidades para llegar a " + num3);
		} else if ((num2 > num1 && num2 > num3) && (num1 < num3)) {
			System.out.print("A " + num3 + " le quedan " + (num2 - num3) + " unidades para llegar a " + num2
					+ " y le sobran " + (num3 - num1) + " unidades para llegar a " + num1);
		}  else if ((num1 > num2 && num1 > num3) && (num2 < num3)) {
			System.out.print("A " + num3 + " le quedan " + (num1 - num3) + " unidades para llegar a " + num1
					+ " y le sobran " + (num3 - num2) + " unidades para llegar a " + num2);
		}  else if ((num3 > num1 && num3 > num2) && (num2 < num1)) {
			System.out.print("A " + num1 + " le quedan " + (num3 - num1) + " unidades para llegar a " + num3
					+ " y le sobran " + (num1 - num2) + " unidades para llegar a " + num2);
		}  else if ((num3 > num1 && num3 > num2) && (num1 < num2)) {
			System.out.print("A " + num2 + " le quedan " + (num3 - num2) + " unidades para llegar a " + num3
					+ " y le sobran " + (num2 - num1) + " unidades para llegar a " + num1);
		} else {
			System.out.print("A " + num1 + " le quedan " + (num2 - num1) + " unidades para llegar a " + num2
					+ " y le sobran " + (num1 - num3) + "unidades para llegar a " + num3);
		}
		sc.close();
	}

}
