package Condicionales;

import java.util.Scanner;

public class Page5Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de un dia de la semana");
		int dia = sc.nextInt();
		if (dia >= 1 && dia <= 5) {
			System.out.print("Es un día laboral");
		} else if (dia <= 7 && dia >5) {
			System.out.print("Es fin de semana");
		}
		sc.close();
	}

}
