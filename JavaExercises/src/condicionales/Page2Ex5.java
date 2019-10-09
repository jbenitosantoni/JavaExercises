package condicionales;

import java.util.Scanner;

public class Page2Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dia");
		int dia = sc.nextInt();
		System.out.println("Introduce mes");
		int mes = sc.nextInt();
		System.out.println("Introduce año");
		int año = sc.nextInt();
		if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 30)) {
			dia = dia + 1;
		} else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && (dia == 30)) {
			dia = dia - 29;
			mes = mes + 1;
		} else if ((mes == 12) && (dia == 30)) {
			dia = dia -29;
			mes = mes - 11;
			año = año + 1;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 31)) {
			dia = dia + 1;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia == 31)) {
			dia = dia - 30;
			mes = mes + 1;
		} else if ((mes == 2) && (dia < 28) ) {
			dia = dia + 1;
		} else if ((mes == 2) && (dia == 28) ) {
			dia = dia - 27;
			mes = mes + 1;
		}
		System.out.print("El día siguiente es: " + dia + "-" + mes + "-" + año);
	}

}
