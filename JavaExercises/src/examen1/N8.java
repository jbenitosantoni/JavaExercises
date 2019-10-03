package examen1;

import java.util.Scanner;

public class N8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tanteo de juegos de Nadal");
		int nadal = sc.nextInt();
		System.out.println("Introduce tanteo de juegos de Thiem");
		int thiem = sc.nextInt();
		if (nadal < 6 && thiem < 6) {
			System.out.println("En juego");
		} else if (nadal == 6 && thiem <= 4) {
			System.out.print("Gana nadal");
		} else if (thiem == 6 && nadal <= 4) {
			System.out.print("Gana Thiem");
		} else if (thiem == 5 && nadal == 5) {
			System.out.print("Desempate a 7");
		} else if (thiem == 7 && nadal == 5) {
			System.out.print("Gana Thiem");
		} else if (thiem == 7 && nadal == 6) {
			System.out.print("Gana Thiem");
		} else if (nadal == 7 && thiem == 5) {
			System.out.print("Gana Nadal");
		} else if (nadal == 7 && thiem == 6) {
			System.out.print("Gana Nadal");
		} else if (nadal == 6 && thiem == 6) {
			System.out.print("Desempate en el próximo juego.");
		} else if (nadal == 5 && thiem == 6) {
			System.out.print("En juego");
		} else if (thiem == 5 && nadal == 6) {
			System.out.print("En juego");
		} else if (nadal > 7 || thiem > 7) {
			System.out.print("Inválido");
		} else if ((nadal < 6 && thiem >= 7) || (thiem < 6 && nadal >= 7)) {
			System.out.print("Inválido");
		}
		sc.close();
	}

}
