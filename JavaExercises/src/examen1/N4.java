package examen1;

import java.util.Scanner;

public class N4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre");
		String nombre = sn.nextLine();
		System.out.println("Introduce nota");
		double nota = sc.nextInt();
		System.out.println("Introduce asistencia (%)");
		double asistencia = sc.nextDouble();

		System.out.println("Introduce nombre");
		String nombre2 = sn.nextLine();
		System.out.println("Introduce nota");
		double nota2 = sc.nextInt();
		System.out.println("Introduce asistencia (%)");
		double asistencia2 = sc.nextDouble();

		System.out.println("Introduce nombre");
		String nombre3 = sn.nextLine();
		System.out.println("Introduce nota");
		double nota3 = sc.nextInt();
		System.out.println("Introduce asistencia (%)");
		double asistencia3 = sc.nextDouble();

		System.out.println("Introduce nombre");
		String nombre4 = sn.nextLine();
		System.out.println("Introduce nota");
		double nota4 = sc.nextInt();
		System.out.println("Introduce asistencia (%)");
		double asistencia4 = sc.nextDouble();

		System.out.println("Introduce nombre");
		String nombre5 = sn.nextLine();
		System.out.println("Introduce nota");
		double nota5 = sc.nextInt();
		System.out.println("Introduce asistencia (%)");
		double asistencia5 = sc.nextDouble();

		if (nota <= 10 && nota >= 6 && asistencia > 90) {
			System.out.println(nombre + " cumple los requisitos.");
		}
		if (nota2 <= 10 && nota2 >= 6 && asistencia2 > 90) {
			System.out.println(nombre2 + " cumple los requisitos.");
		}
		if (nota3 <= 10 && nota3 >= 6 && asistencia3 > 90) {
			System.out.println(nombre3 + " cumple los requisitos.");
		}
		if (nota4 <= 10 && nota4 >= 6 && asistencia4 > 90) {
			System.out.println(nombre4 + " cumple los requisitos.");
		}
		if (nota5 <= 10 && nota5 >= 6 && asistencia5 > 90) {
			System.out.println(nombre5 + " cumple los requisitos.");
		}
		sc.close();
		sn.close();
	}

}
