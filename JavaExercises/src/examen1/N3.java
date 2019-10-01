package examen1;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre");
		String nombre = sn.nextLine();
		System.out.println("Introduce edad");
		int edad = sc.nextInt();
		System.out.println("Introduce altura en metros");
		double altura = sc.nextDouble();
		System.out.println("Introduce peso en kg");
		double peso = sc.nextDouble();

		System.out.println("Introduce nombre");
		String nombre2 = sn.nextLine();
		System.out.println("Introduce edad");
		int edad2 = sc.nextInt();
		System.out.println("Introduce altura en metros");
		double altura2 = sc.nextDouble();
		System.out.println("Introduce peso en kg");
		double peso2 = sc.nextDouble();

		System.out.println("Introduce nombre");
		String nombre3 = sn.nextLine();
		System.out.println("Introduce edad");
		int edad3 = sc.nextInt();
		System.out.println("Introduce altura en metros");
		double altura3 = sc.nextDouble();
		System.out.println("Introduce peso en kg");
		double peso3 = sc.nextDouble();

		System.out.println("Introduce nombre");
		String nombre4 = sn.nextLine();
		System.out.println("Introduce edad");
		int edad4 = sc.nextInt();
		System.out.println("Introduce altura en metros");
		double altura4 = sc.nextDouble();
		System.out.println("Introduce peso en kg");
		double peso4 = sc.nextDouble();

		if (edad >= 30 && edad <= 60 && peso < 100 && altura > 1.5 && altura < 1.9) {
			System.out.println(nombre + " cumples los requisitos");
		}
		if (edad2 >= 30 && edad2 <= 60 && peso2 < 100 && altura2 >= 1.5 && altura2 <= 1.9) {
			System.out.println(nombre2 + " cumples los requisitos");
		}
		if (edad3 >= 30 && edad3 <= 60 && peso3 < 100 && altura3 >= 1.5 && altura3 <= 1.9) {
			System.out.println(nombre3 + " cumples los requisitos");
		}
		if (edad4 >= 30 && edad4 <= 60 && peso4 < 100 && altura4 >= 1.5 && altura4 <= 1.9) {
			System.out.println(nombre4 + " cumples los requisitos");
		}
		sc.close();
		sn.close();
	}

}
