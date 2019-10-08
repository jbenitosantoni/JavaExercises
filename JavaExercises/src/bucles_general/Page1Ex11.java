package bucles_general;

import java.util.Scanner;

public class Page1Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intro = 0;
		while (intro != 5) {
			System.out.println("1. Crear usuario.");
			System.out.println("2. Eliminar usuario.");
			System.out.println("3. Modificar usuario.");
			System.out.println("4. Visualizar datos usuario.");
			System.out.println("5. Salir.");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				System.out.println("Creamos un usuario");
				break;
			case 2:
				System.out.println("Eliinamos un usuario");
				break;
			case 3:
				System.out.println("Modificamos un usuario");
				break;
			case 4:
				System.out.println("Visualizamos datos de un usuario");
				break;
			}
			
		}
		System.out.println("Programa finalizado");
		sc.close();
	}

}
