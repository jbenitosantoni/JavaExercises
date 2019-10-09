package condicionales;

import java.util.Scanner;

public class Page4Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0 && num4 == 0) {
			System.out.print("Todos son pares");
		}else if(num1 % 2 != 0 && num2 % 2 != 0 && num3 % 2 != 0 && num4 != 0){
			System.out.print("Todos son impares");
		}
		sc.close();
	}
}