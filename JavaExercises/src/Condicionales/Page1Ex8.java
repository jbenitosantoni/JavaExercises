package Condicionales;

import java.util.Scanner;

public class Page1Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dia");
		int dia = sc.nextInt();
		System.out.println("Introduce mes");
		int mes = sc.nextInt();
		System.out.println("Introduce año");
		int año = sc.nextInt();
		if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && año >= 2000 && año <= 2100) {
			System.out.println("La fecha " + dia +  "-" + mes + "-" + año + " es correcta");
		}

	}

}
