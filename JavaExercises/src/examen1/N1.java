package examen1;

import java.util.Scanner;

public class N1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce radio");
		double radio = sc.nextDouble();
		System.out.println("Intoduce altura");
		double altura = sc.nextDouble();
		System.out.print("El volumen del sable laser es: " + Math.pow(radio, 2) * Math.PI * altura);
		sc.close();
	}

}