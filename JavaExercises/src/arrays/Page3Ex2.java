package arrays;

import java.util.Scanner;

public class Page3Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int uno[] = new int[5];
		int dos[] = new int[5];
		int tres[] = new int[5];
		boolean iguales = true;
		for (int i = 0; i < uno.length; i++) {
			uno[i] = sc.nextInt();
			dos[i] = sc.nextInt();
			tres[i] = sc.nextInt();
		}
		for (int i = 0; i < uno.length; i++) {
			if (uno[i] != dos[i] || dos[i] != tres[i] || uno[i] != tres[i]) {
				iguales = false;
			}
		}
	}

}
