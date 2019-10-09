package day1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Introduce nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce precio");
		Double precio = sc1.nextDouble();
		Double calculo = precio * 1.21;
		System.out.print("El precio con IVA es: " + calculo);

	}

}
