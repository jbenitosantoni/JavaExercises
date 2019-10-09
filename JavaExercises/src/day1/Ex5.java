package day1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce Nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce Velocidad");
		double velocidad = sc.nextDouble();
		System.out.println("Introduce Fuerza");
		double fuerza = sc.nextDouble();
		System.out.println("Introduce Defensa");
		double defensa = sc.nextDouble();
		System.out.println("Introduce Dribling");
		double dribling = sc.nextDouble();
		System.out.println("Introduce Pase");
		double pase = sc.nextDouble();
		double valor = (velocidad + fuerza + defensa + dribling + pase)/5;
		System.out.println("El valor de " + nombre + " es: " + valor);

	}

}
