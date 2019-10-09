package condicionales;

import java.util.Scanner;

public class Page6Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Precio producto");
		double precio = sc.nextDouble();
		System.out.println("Unidades");
		int unidades = sc.nextInt();
		double total = (unidades * precio) * 1.21;
		if (unidades > 20 && unidades <= 50) {
			total = total * 0.75;
		} else if (unidades > 50) {
			total = total * 0.7;
		}
		System.out.print(total);
		sc.close();
	}
}