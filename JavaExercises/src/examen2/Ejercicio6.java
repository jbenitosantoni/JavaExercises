package examen2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		String taxis[][] = new String[2][5];
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int intro = 0;
		do {
			System.out.println("1. Introducir taxis");
			System.out.println("2. Mostrar listado");
			System.out.println("3. Modificar Datos");
			System.out.println("4. Salir");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < taxis.length; i++) {
					System.out.println("Marca");
					taxis[i][0] = sn.nextLine();
					System.out.println("Modelo");
					taxis[i][1] = sn.nextLine();
					System.out.println("Nº Licencia");
					taxis[i][2] = sn.nextLine();
					// Comprobamos si ya existe
					if (i != 0) {
						if (taxis[i][2].equalsIgnoreCase(taxis[i - 1][2])) {
							do {
								System.out.println(
										"ESTAS INTRODUCIENDO EL MISMO NUMERO DE LICENCIA DOS VECES, VUELVE A INTRODUCIRLO");
								taxis[i][2] = sn.nextLine();
								// Si vuelve a introducir la misma se lo volvemos a pedir
							} while (taxis[i][2].equalsIgnoreCase(taxis[i - 1][2]));
						}
					}
					System.out.println("Kms");
					taxis[i][3] = sn.nextLine();
					System.out.println("CV");
					taxis[i][4] = sn.nextLine();
				}
				break;
			case 2:
				for (int i = 0; i < taxis.length; i++) {
					for (int j = 0; j < taxis[0].length; j++) {
						if (j == 0) {
							System.out.print("Marca: " + taxis[i][j]);
						} else if (j == 1) {
							System.out.print(" - Modelo: " + taxis[i][j]);
						} else if (j == 2) {
							System.out.print(" - Licencia: " + taxis[i][j]);
						} else if (j == 3) {
							System.out.print(" - KMS: " + taxis[i][j]);
						} else if (j == 4) {
							System.out.print(" - CV: " + taxis[i][j]);
							System.out.println();
						}

					}
				}
			case 3:
				System.out.println("Introduce numero de licencia");
				String licencia = sn.nextLine();
				Boolean existe = false;
				do {
					for (int i = 0; i < taxis.length; i++) {
						if (licencia.equalsIgnoreCase(taxis[i][2])) {
							System.out.println("Marca");
							taxis[i][0] = sn.nextLine();
							System.out.println("Modelo");
							taxis[i][1] = sn.nextLine();
							System.out.println("Kms");
							taxis[i][3] = sn.nextLine();
							System.out.println("CV");
							taxis[i][4] = sn.nextLine();
							existe = true;
						}
					}
					if (!existe) {
						System.out.println("El numero de licencia no existe, introducelo de nuevo");
						licencia = sn.nextLine();
					}
				} while (!existe);
				break;
			}
		} while (intro != 4);
		sc.close();
		sn.close();
	}

}
