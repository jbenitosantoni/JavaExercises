package strings;

import java.util.Scanner;

public class Page2Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce Frase");
		System.out.println(sc.nextLine().toUpperCase().replace("A", "a").replace("B", "b"));
		sc.close();

	}

}
