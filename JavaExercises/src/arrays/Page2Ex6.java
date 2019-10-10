package arrays;

import java.util.Scanner;

public class Page2Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas personas vas a introducir");
		int personas = sc.nextInt();
		int alturas[] = new int[personas];
		int media = 0;
		int mayormedia = 0;
		int menormedia = 0;
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Introduce altura para persona " + i);
			alturas[i] = sc.nextInt();
		}
		for (int i = 0; i < alturas.length; i++) {
			media = alturas[i] + media;
		}
		media = media / alturas.length;
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > media) {
				mayormedia++;
			} else if (alturas[i] < media) {
				menormedia++;
			}
		}
		sc.close();
	}

}
