package bucles_general;

import java.util.Scanner;

public class Page1Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero empleados");
		int empleados = 0;
		double sueldo = 0;
		double sumasueldo = 0;
		for (int i = 0; i < empleados; i++) {
			System.out.println("Introduce sueldo");
			sueldo = sc.nextDouble();
			sumasueldo = sumasueldo + sueldo;
		}
		System.out.print("El sueldo medio es " + sumasueldo / empleados + " euros.");
		sc.close();
	}

}
