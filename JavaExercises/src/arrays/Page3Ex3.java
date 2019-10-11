package arrays;

import java.util.Scanner;

public class Page3Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int uno[] = new int[5];
		int dos[] = new int[5];
		int tres[] = new int[5];
		for (int i = 0; i < uno.length; i++) {
			uno[i] = sc.nextInt();
			dos[i] = sc.nextInt();
		}
		for (int i = 0; i < uno.length; i++) {
			tres [i] = uno[i] * dos[i];
		}
	}

}
