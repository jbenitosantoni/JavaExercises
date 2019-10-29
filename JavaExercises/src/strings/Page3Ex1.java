package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Page3Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce frase");
		String s = sc.nextLine();
	    String palabra = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
	    System.out.println("Palabra mas larga: " + palabra + " con " + palabra.length() + " letras.");
	    sc.close();

	}

}
