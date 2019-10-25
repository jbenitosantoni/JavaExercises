package strings;

import java.util.Scanner;

public class Page1Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu Ciudad");
		String ciudad = sc.nextLine();
		System.out.println(ciudad.toUpperCase() + ciudad.toLowerCase());
		sc.close();
	}

}
