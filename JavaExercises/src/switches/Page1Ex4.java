package switches;

import java.util.Scanner;

public class Page1Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero de horas trabajadas y tarifa por horas.");
		double horas = sc.nextDouble();
		double tarifa = sc.nextDouble();
		if (horas > 40) {
			tarifa = tarifa * 1.4;
			System.out.print("El sueldo sería de: " + tarifa * horas);
		} else {
			System.out.print("El sueldo sería de: " + tarifa * horas);
		}
		sc.close();
	}

}
