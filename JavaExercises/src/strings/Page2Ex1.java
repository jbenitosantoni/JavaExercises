package strings;

import java.util.Scanner;

public class Page2Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce Frase");
		System.out.println(
				sc.nextLine().replace("a", "%").replace("A", "%").replace("E", "%").replace("e", "%").replace("I", "%")
						.replace("i", "%").replace("O", "%").replace("o", "%").replace("U", "%").replace("u", "%"));
		sc.close();
	}
}
