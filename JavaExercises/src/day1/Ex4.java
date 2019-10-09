package day1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Radio de circulo");
		double radio = sc.nextDouble();
		double area = Math.pow (radio, 2) * Math.PI;
		System.out.println("El area del circulo es: " + area);
	}

}