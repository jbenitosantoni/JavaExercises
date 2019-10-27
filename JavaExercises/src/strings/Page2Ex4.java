package strings;

import java.util.Scanner;

public class Page2Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce Frase");
		System.out.println(sc.nextLine().replace(" ", ""));
		sc.close();

	}

}
