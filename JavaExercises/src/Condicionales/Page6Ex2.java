package Condicionales;

import java.util.Scanner;

public class Page6Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres números");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double grande = 0;
		double mediano = 0;
		double pequeño = 0;
		if (num1 > num2 && num3 < num1) {
			grande = num1;
			if (num2 > num3) {
				mediano = num2;
				pequeño = num3;
				System.out.print(grande + ", " + mediano + ", " + pequeño);
			} else {
				mediano = num3;
				pequeño = num2;
				System.out.print(grande + ", " + mediano + ", " + pequeño);
			}
		} else if (num2 > num1 && num3 < num2) {
			grande = num2;
			if (num3 > num1) {
				mediano = num3;
				pequeño = num1;
				System.out.print(grande + ", " + mediano + ", " + pequeño);
			} else {
				mediano = num1;
				pequeño = num3;
				System.out.print(grande + ", " + mediano + ", " + pequeño);
			}
		} else if (num3 > num1 && num1 < num3) {
			grande = num3;
			if (num2 > num1) {
				mediano = num2;
				pequeño = num1;
				System.out.print(grande + ", " + mediano + ", " + pequeño);
			} else {
				mediano = num1;
				pequeño = num2;
				System.out.print(grande + ", " + mediano + ", " + pequeño);
			}
		}
		sc.close();
	}
}
