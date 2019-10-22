package arrays_bidimensionales;

import java.util.Scanner;

public class Page2Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String notaAlumno[][] = new String[2][6];
		int intro = 0;
		do {
			System.out.println("1. Insertar nombres de alumnos");
			System.out.println("2. Insertar notas alumnos");
			System.out.println("3. Mostrar notas de un alumno");
			System.out.println("4. Mostrar notas de todos los alumnos");
			System.out.println("5. Modificar datos de un alumno");
			System.out.println("6. Poner un 0 a todos los alumnos en todos los modulos");
			System.out.println("7. Aprobado general a todos los alumnos en todos los modulos");
			System.out.println("8. Salir");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < notaAlumno.length; i++) {
					System.out.println("Nombre alumno " + (i+1) + ":");
					notaAlumno[i][0] = sn.nextLine();
				}
				break;
			case 2:
				for (int i = 0; i < notaAlumno.length; i++) {
					System.out.println("Introduce nota de Redes para " + notaAlumno[i][0]);
					notaAlumno[i][1] = sn.nextLine();
					System.out.println("Introduce nota de Sistemas para " + notaAlumno[i][0]);
					notaAlumno[i][2] = sn.nextLine();
					System.out.println("Introduce nota de Moviles para " + notaAlumno[i][0]);
					notaAlumno[i][3] = sn.nextLine();
					System.out.println("Introduce nota de Programacion para " + notaAlumno[i][0]);
					notaAlumno[i][4] = sn.nextLine();
					System.out.println("Introduce nota de FOL para " + notaAlumno[i][0]);
					notaAlumno[i][5] = sn.nextLine();
				}
				break;
			case 3:
				System.out.print("Introduce nombre de alumno");
				boolean existe = false;
				for (int i = 0; i < notaAlumno[0].length; i++) {
					if (sn.nextLine().equalsIgnoreCase(notaAlumno[i][0])) {
						System.out.println("Notas de " + notaAlumno[i][0] + ": Redes: " + notaAlumno[i][1]
								+ " - Sistemas: " + notaAlumno[i][2] + " - Moviles: " + notaAlumno[i][3]
								+ " - Programacion: " + notaAlumno[i][4] + " - FOL: " + notaAlumno[i][5]);
						existe = true;
					}
				}
				if (!existe) {
					System.out.println("El alumno introducido no existe");
				}
				break;
			case 4:
				for (int i = 0; i < notaAlumno.length; i++) {
					for (int j = 0; j < notaAlumno[0].length; j++) {
						if (j == 0) {
							System.out.print(notaAlumno[i][0] + ": ");
						} else if (j == 1) {
							System.out.print("Redes: " + notaAlumno[i][j]);
						} else if (j == 2) {
							System.out.print(" - Sistemas: " + notaAlumno[i][j]);
						} else if (j == 3) {
							System.out.print(" - Moviles: " + notaAlumno[i][j]);
						} else if (j == 4) {
							System.out.print(" - Programacion: " + notaAlumno[i][j]);
						} else if (j == 2) {
							System.out.print(" - FOL: " + notaAlumno[i][j]);
						}
					}
					System.out.println();
				}
			}
		} while (intro != 8);
	}
}
