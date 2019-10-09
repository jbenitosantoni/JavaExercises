package arrays;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] sueldos = new double[10];
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Introduce sueldo");
			sueldos[i] = sc.nextDouble();
		}
		for (int i = sueldos.length-1; i >= 0; i--) {
			System.out.println(sueldos[i]);
		}
		sc.close();
	}

}
