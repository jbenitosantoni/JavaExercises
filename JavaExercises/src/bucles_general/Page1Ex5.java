package bucles_general;

import java.util.Scanner;

public class Page1Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos numeros");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numerogrande = Math.max(numero1, numero2);
		int numeropequeño = Math.min(numero1, numero2);
		
		while (numeropequeño < numerogrande) {
			boolean flag = false;
			for (int i = 2; i <= numeropequeño/2; i++) {
				if (numeropequeño % i == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.print(numeropequeño + " ");
				numeropequeño++;
			}
		}
		sc.close();
	}

}
