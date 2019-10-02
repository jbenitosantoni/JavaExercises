package switches;

import java.util.Scanner;

public class Day1Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre y notas en: Programación, sistemas y bases de datos");
		String nombre = sc.nextLine();
		double notaprogramacion = sc.nextDouble();
		double notaprosistemas = sc.nextDouble();
		double notabdd = sc.nextDouble();
		System.out.println("Introduce tu nombre y notas en: Programación, sistemas y bases de datos");
		String nombre2 = sc.nextLine();
		double notaprogramacion2 = sc.nextDouble();
		double notaprosistemas2 = sc.nextDouble();
		double notabdd2 = sc.nextDouble();
		System.out.println("Introduce tu nombre y notas en: Programación, sistemas y bases de datos");
		String nombre3 = sc.nextLine();
		double notaprogramacion3 = sc.nextDouble();
		double notaprosistemas3 = sc.nextDouble();
		double notabdd3 = sc.nextDouble();
		System.out.println("Introduce tu nombre y notas en: Programación, sistemas y bases de datos");
		String nombre4 = sc.nextLine();
		double notaprogramacion4 = sc.nextDouble();
		double notaprosistemas4 = sc.nextDouble();
		double notabdd4 = sc.nextDouble();
		System.out.println("Introduce tu nombre y notas en: Programación, sistemas y bases de datos");
		String nombre5 = sc.nextLine();
		double notaprogramacion5 = sc.nextDouble();
		double notaprosistemas5 = sc.nextDouble();
		double notabdd5 = sc.nextDouble();
		System.out.print(
				"1. Mostrar notas alumno 1\n2. Mostrar notas alumno 2\n3.Mostrar notas alumno 3\n4. Mostrar nota media de todos los alumnos en todas las asignaturas\n5. Mostrar nota media de todos los alumnos en programación\n6. Mostrar nota media de todos los alumnos en Sistemas\n7. Mostrar nota media de todos los alumnos en BDD\n8. Salir");
		int valor = sc.nextInt();
		switch (valor) {
		case 1:
			System.out.println(nombre + ": Programacion: " + notaprogramacion + "Sistemas: " + notaprosistemas + "BDD: "
					+ notabdd);
			break;
		case 2:
			System.out.println(nombre2 + ": Programacion: " + notaprogramacion2 + "Sistemas: " + notaprosistemas2
					+ "BDD: " + notabdd2);
			break;
		case 3:
			System.out.println(nombre3 + ": Programacion: " + notaprogramacion3 + "Sistemas: " + notaprosistemas3
					+ "BDD: " + notabdd3);
			break;
		case 4:
			System.out.println((notaprogramacion + notaprosistemas + notabdd + notaprogramacion2 + notaprosistemas2
					+ notabdd2 + notaprogramacion3 + notaprosistemas3 + notabdd3 + notaprogramacion4 + notaprosistemas4
					+ notabdd4 + notaprogramacion5 + notaprosistemas5 + notabdd5) / 15);
			break;
		case 5:
			System.out.println(
					(notaprogramacion + notaprogramacion2 + notaprogramacion3 + notaprogramacion4 + notaprogramacion5)
							/ 5);
			break;
		case 6:
			System.out.println(
					(notaprosistemas + notaprosistemas2 + notaprosistemas3 + notaprosistemas4 + notaprosistemas5) / 5);
		case 7:
			System.out.println((notabdd + notabdd2 + notabdd3 + notabdd4 + notabdd5) / 5);
		case 8:
			System.out.print("Saliendo...");
		}
	}
}
