package condicionales;

import java.util.Scanner;

public class Page2Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dia");
		int dia = sc.nextInt();
		System.out.println("Introduce mes");
		int mes = sc.nextInt();
			if ((dia >= 22 && mes == 6) || (mes >= 7 && mes <= 8) || (dia <= 22 && mes == 9)) {
				System.out.print("Es Verano");
		} else if ((dia >= 23 && mes == 9) || (mes >= 10 && mes <= 11) || (dia <= 20 && mes == 12)) {
			System.out.print("Es Otoño");
		} else if ((dia >= 21 && mes == 12) || (mes >= 1 && mes <= 2) || (dia <= 20 && mes == 3)) {
			System.out.print("Es Invierno");
		} else if ((dia >= 21 && mes == 3) || (mes >= 4 && mes <= 5) || (dia <= 21 && mes == 6)) {
			System.out.print("Es Primavera");
		}
	}

}
