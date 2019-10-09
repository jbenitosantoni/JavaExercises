package arrays;

import java.util.Scanner;

public class Page1Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regalos[] = new String[8];
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Introduce regalo");
			regalos[i] = sc.nextLine();
		}
		for (int i = 0; i < regalos.length; i++) {
			if (regalos[i].equalsIgnoreCase("coche")) {
				regalos[i] = "carbón";
			}
		}
		for (int i = 0; i < regalos.length; i++) {
			System.out.print(regalos[i] + ", ");
		}
		System.out.print("\n");
		for (int i = regalos.length - 1; i >= 0; i--) {
			System.out.print(regalos[i] + ", ");
		}
		for (int i = 0; i < regalos.length; i++) {
			if (regalos[i].equalsIgnoreCase("dinero") || regalos[i].equalsIgnoreCase("avion")) {
				regalos[i] = "";
			}
		}
		for (int i = 0; i < regalos.length; i++) {
			regalos[i] = "nada por feo";
		}
		sc.close();

	}

}
