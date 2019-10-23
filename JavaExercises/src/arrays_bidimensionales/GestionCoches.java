package arrays_bidimensionales;

import java.util.Scanner;

public class GestionCoches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int intro = 0;
		boolean recorrido = false;
		String coches [][] = new String [10][4];
		do {
			if (!recorrido) {
				for (int i = 0; i < coches.length; i++) {
					System.out.println("Introduce Matricula de coche");
					coches[i][0] = sn.nextLine();
					System.out.println("Introduce Marca de coche");
					coches[i][1] = sn.nextLine();
					System.out.println("Introduce Modelo de coche");
					coches[i][2] = sn.nextLine();
					System.out.println("Introduce KMs de coche");
					coches[i][3] = sn.nextLine();
				}
				recorrido = true;
			}
			System.out.println("1. Mostrar datos de coches");
			System.out.println("2. Buscar coche");
			System.out.println("3. Modificar datos coche");
			System.out.println("4. Salir");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < coches.length; i++) {
					for (int j = 0; j < coches[0].length; j++) {
						if(j == 0) {
							System.out.print("Matricula: " + coches[i][j]);
						} else if(j == 1) {
							System.out.print(" - Marca: " + coches[i][j]);
						} else if(j == 2) {
							System.out.print(" - Modelo: " + coches[i][j]);
						} else if(j == 3) {
							System.out.print(" - KMs: " + coches[i][j]);
						}
					}
					System.out.println();
				}
			case 2:
				System.out.println("Introduce matrícula");
				String matricula = sn.nextLine();
				Boolean existe = false;
				for (int i = 0; i < coches.length; i++) {
					if (matricula.equalsIgnoreCase(coches[i][0])) {
						System.out.println("Matricula: " + coches[i][0] + " - Marca: " + coches[i][1] + " - Modelo: " + coches[i][2] + " - KMs: " + coches[i][3]);
						existe = true;
					}
				}
				if (!existe) {
					System.out.println("La matricula no existe");
				}
			case 3:
				System.out.println("Introduce matrícula");
				String matricula2 = sn.nextLine();
				Boolean existe2 = false;
				for (int i = 0; i < coches.length; i++) {
					if (matricula2.equalsIgnoreCase(coches[i][0])) {
						System.out.println("Introduce Marca de coche");
						coches[i][1] = sn.nextLine();
						System.out.println("Introduce Modelo de coche");
						coches[i][2] = sn.nextLine();
						System.out.println("Introduce KMs de coche");
						coches[i][3] = sn.nextLine();
						existe = true;
					}
				}
				if (!existe2) {
					System.out.println("La matricula no existe");
				}
			}
		} while (intro != 4);
	}

}
