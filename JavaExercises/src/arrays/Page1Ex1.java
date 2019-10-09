package arrays;

import java.util.Scanner;

public class Page1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regalos[] = new String[8];
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Introduce regalo");
			regalos[i] = sc.nextLine();
		}
		sc.close();
	}

}
