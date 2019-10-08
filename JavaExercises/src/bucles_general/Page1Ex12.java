package bucles_general;

import java.util.Scanner;

public class Page1Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int intro = 0;
		String nombre = "";
		String DNI = "";
		int edad = 0;
		String domicilio = "";
		while (intro != 5) {
			System.out.println("1. Crear usuario.");
			System.out.println("2. Eliminar usuario.");
			System.out.println("3. Modificar usuario.");
			System.out.println("4. Visualizar datos usuario.");
			System.out.println("5. Salir.");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				System.out.println("Introduce nombre");
				nombre = sn.nextLine();
				System.out.println("Introduce DNI");
				DNI = sn.nextLine();
				System.out.println("Introduce edad");
				edad = sc.nextInt();
				System.out.println("Introduce domicilio");
				domicilio = sn.nextLine();
				break;
			case 2:
				nombre = "";
				DNI = "";
				edad = 0;
				domicilio = "";
				break;
			case 3:
				System.out.println("Introduce nombre");
				nombre = sn.nextLine();
				System.out.println("Introduce DNI");
				DNI = sn.nextLine();
				System.out.println("Introduce edad");
				edad = sc.nextInt();
				System.out.println("Introduce domicilio");
				domicilio = sn.nextLine();
				break;
			case 4:
				System.out.println("Nombre: " + nombre + "\nDNI: " + DNI + "\nEdad: " + edad + "\nDomicilio: " + domicilio);
				break;
			}

		}
		System.out.println("Programa finalizado");
		sc.close();
		sn.close();
	}
}
