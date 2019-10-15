package arrays;

import java.util.Scanner;

public class Page5Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int intro = 0;
		int programacion[] = new int[5];
		int bd[] = new int[5];
		int moviles[] = new int[5];
		String nombres[] = new String[5];
		double mejoralumnomedia = 0;
		String peoralumno = "";
		String mejoralumno = "";
		int mediabd = 0;
		int mediaprogramacion = 0;
		int mediamoviles = 0;
		while (intro != 10) {
			System.out.println("1. Introducir nombres de alumnos");
			System.out.println("2. Rellenar notas alumnos");
			System.out.println("3. Mostrar notas de alumnos");
			System.out.println("4. Modificar notas de alumnos");
			System.out.println("5. Mostrar nombre del mejor alumno");
			System.out.println("6. Mostrar nota media de un alumno");
			System.out.println("7. Mostrar nota media de todos los alumnos");
			System.out.println("8. Mostrar la nota media por asignaturas");
			System.out.println("9. Mostrar peor alumno (Ejecutar 5 antes)");
			System.out.println("10. Salir");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				System.out.println("Introduce 5 nombres");
				for (int i = 0; i < nombres.length; i++) {
					nombres[i] = sn.nextLine();
				}
				break;
			case 2:
				for (int i = 0; i < programacion.length; i++) {
					programacion[i] = Randomizer.generate(0, 10);
					bd[i] = Randomizer.generate(0, 10);
					moviles[i] = Randomizer.generate(0, 10);
				}
				break;
			case 3:
				for (int i = 0; i < programacion.length; i++) {
					System.out.println(nombres[i] + ": Programación: " + programacion[i] + " - BD: " + bd[i]
							+ " - Moviles: " + moviles[i]);
				}
				break;
			case 4:
				System.out.println("Introduce nombre alumno");
				String alumno = sn.nextLine();
				System.out.println("Introduce asignatura");
				String asignatura = sn.nextLine();
				for (int i = 0; i < programacion.length; i++) {
					if (alumno.equalsIgnoreCase(nombres[i]) && (asignatura.equalsIgnoreCase("bd")
							|| asignatura.equalsIgnoreCase("programacion") || asignatura.equalsIgnoreCase("moviles"))) {
						System.out.println("Introduce nota nueva");
						if (asignatura.equalsIgnoreCase("bd")) {
							bd[i] = sc.nextInt();
						} else if (asignatura.equalsIgnoreCase("moviles")) {
							moviles[i] = sc.nextInt();
						} else if (asignatura.equalsIgnoreCase("programacion")) {
							programacion[i] = sc.nextInt();
						} else {
							System.out.print("No existe");
						}
					}
				}
				break;
			case 5:
				for (int i = 0; i < bd.length; i++) {
					if (((programacion[i] + moviles[i] + bd[i]) / 4) > mejoralumnomedia) {
						mejoralumnomedia = (programacion[i] + moviles[i] + bd[i]) / 4;
						mejoralumno = nombres[i];
					}
				}
				System.out.println("El mejor alumno es: " + mejoralumno + " con una media de: " + mejoralumnomedia);
				break;
			case 6:
				System.out.println("Intorduce nombre alumno");
				for (int i = 0; i < bd.length; i++) {
					if (sn.nextLine().equalsIgnoreCase(nombres[i])) {
						System.out.println(
								"Media de: " + nombres[i] + " es " + ((bd[i] + programacion[i] + moviles[i]) / 3));
					} else {
						System.out.println("No existe");
					}
				}
				break;
			case 7:
				for (int i = 0; i < bd.length; i++) {
					System.out.println(nombres[i] + " - BD: " + bd[i] + " - Programacion: " + programacion[i]
							+ " - Moviles: " + moviles[i]);
				}
				break;
			case 8:
				for (int i = 0; i < bd.length; i++) {
					mediabd = mediabd + bd[i];
					mediaprogramacion = mediaprogramacion + programacion[i];
					mediamoviles = mediamoviles + moviles[i];
				}
				mediabd = mediabd / bd.length;
				mediaprogramacion = mediaprogramacion / programacion.length;
				mediamoviles = mediamoviles / moviles.length;
				System.out.println("Base de datos: " + mediabd);
				System.out.println("Programacion: " + mediaprogramacion);
				System.out.println("Moviles: " + mediamoviles);
				break;
			case 9:
				double peoralumnomedia = mejoralumnomedia;
				System.out.println(peoralumnomedia);
				for (int i = 0; i < bd.length; i++) {
					if (((programacion[i] + moviles[i] + bd[i]) / 4) < peoralumnomedia) {
						peoralumnomedia = (programacion[i] + moviles[i] + bd[i]) / 4;
						peoralumno = nombres[i];
					}
				}
				System.out.println("El peor alumno es: " + peoralumno + " con una media de: " + peoralumnomedia);
				break;
			}
		}
		sc.close();
		sn.close();
	}
}
