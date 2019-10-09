package day1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Base triángulo");
		double base = sc.nextDouble();
		System.out.println("Altura triángulo");
		double altura = sc.nextDouble();
		double area = (base * altura) / 2;
		System.out.println("El area del trángulo es: " + area + " unidades cuadradas");
	}

}
