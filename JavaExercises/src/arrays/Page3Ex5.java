package arrays;

import java.util.Scanner;

public class Page3Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int uno[] = new int[5];
		int posiciones[] = {0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < uno.length; i++) {
			uno[i] = sc.nextInt();
		}
		for (int i = 0; i < uno.length; i++) {
			if (uno[i] == 1) {
				posiciones[0]++;
			} else if (uno[i] == 2) {
				posiciones[1]++;
			} else if (uno[i] == 3) {
				posiciones[2]++;
			} else if (uno[i] == 4) {
				posiciones[3]++;
			} else if (uno[i] == 5) {
				posiciones[4]++;
			} else if (uno[i] == 6) {
				posiciones[5]++;
			} else if (uno[i] == 7) {
				posiciones[6]++;
			} else if (uno[i] == 8) {
				posiciones[7]++;
			} else if (uno[i] == 9) {
				posiciones[8]++;
			} else if (uno[i] == 10) {
				posiciones[9]++;
			}
		}
		for(int i = 0; i < posiciones.length; i++) {
			System.out.print(" " + i + "\n");
			for (int b = posiciones[i]; b > 0; b--) {
				System.out.print("*");
			}
		}
	}

}
