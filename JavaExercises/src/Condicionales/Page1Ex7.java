package Condicionales;

import java.util.Scanner;

public class Page1Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota");
		double nota = sc.nextDouble();
		if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota < 10) {
			System.out.println("Sobresaliente");
		} else if (nota <= 4){
			System.out.println("Insuficiente");
		} else if (nota < 4 && nota < 5){
			System.out.println("No se sabe");
		} else {
			System.out.println("Nota no valida");
		}
	}

}
