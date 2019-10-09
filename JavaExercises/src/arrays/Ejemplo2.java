package arrays;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombres[] = {"Javi", "Julio", "Pepe", "Pedro", "Miguel", "Miguel", "Dima"};
		int migueles = 0;
		int dimas = 0;
		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i].equalsIgnoreCase("Miguel")) {
				migueles++;
			} else if (nombres[i].equalsIgnoreCase("Dima")) {
				dimas++;
			}
		}
		System.out.println("Hay " + migueles + " Migueles" + " y " + dimas + " Dimas.");
		sc.close();
	}

}
