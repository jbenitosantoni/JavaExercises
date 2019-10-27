package strings;

import java.util.Scanner;

public class Page2Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce Nombre");
		System.out.println(sc.nextLine().replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O")
				.replace("u", "U"));
		sc.close();
	}

}
