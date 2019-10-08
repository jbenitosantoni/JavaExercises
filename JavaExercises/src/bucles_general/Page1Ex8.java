package bucles_general;

import java.util.Scanner;

public class Page1Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int respuesta = 1;
		int edad = 0;
		int sumaedad = 0;
		while (respuesta == 1) {
			System.out.println("Introduce edad");
			edad = sc.nextInt();
			System.out.println("¿Continuo preguntando edades 1 = si, 2 = no?");
			respuesta = sc.nextInt();
			sumaedad = sumaedad + edad;
		}
		System.out.print("Suma edades: " + sumaedad);
		sc.close();
	}

}
