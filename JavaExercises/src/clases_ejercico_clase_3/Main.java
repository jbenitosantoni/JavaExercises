package clases_ejercico_clase_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coche[] coches = new Coche[5];
		String marca = "";
		String modelo = "";
		String matricula = "";
		for (int i = 0; i < coches.length; i++) {
			System.out.println("Marca");
			matricula = sc.nextLine();
			System.out.println("Modelo");
			modelo = sc.nextLine();
			System.out.println("Matricula");
			matricula = sc.nextLine();
			coches[i] = new Coche(marca, modelo, matricula);
		}
		sc.close();
	}

}
