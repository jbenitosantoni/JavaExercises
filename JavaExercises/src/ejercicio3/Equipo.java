package ejercicio3;

import java.util.Scanner;

public class Equipo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = 0;
		int entrada2 = 0;
		double radio = 0;
		double longitud = 0;
		double base = 0;
		double altura = 0;
		do {
			menu();
			entrada = sc.nextInt();
			switch (entrada) {
			case 1:
				System.out.println("Introduce radio");
				radio = sc.nextDouble();
				menu2();
				entrada2 = sc.nextInt();
				switch (entrada2) {
				case 1:
					System.out.println(Equipo.hallararea(radio, longitud, base, altura, entrada));
					break;
				case 2:
					System.out.println(Equipo.hallarperimetro(radio, longitud, base, altura, entrada));
					break;
				}
				break;
			case 2:
				System.out.println("Introduce longitud del lado del cuadrado.");
				longitud = sc.nextDouble();
				menu2();
				switch (entrada2) {
				case 1:
					System.out.println(Equipo.hallararea(radio, longitud, base, altura, entrada));
					break;
				case 2:
					System.out.println(Equipo.hallarperimetro(radio, longitud, base, altura, entrada));
					break;
				}
				break;
			case 3:
				System.out.println("Introduce base del triangulo equilatero.");
				base = sc.nextDouble();
				System.out.println("Introduce altura del triangulo equilatero");
				altura = sc.nextDouble();
				menu2();
				entrada2 = sc.nextInt();
				switch (entrada2) {
				case 1:
					System.out.println(Equipo.hallararea(radio, longitud, base, altura, entrada));
					break;
				case 2:
					System.out.println(Equipo.hallarperimetro(radio, longitud, base, altura, entrada));
					break;
				}
				break;
			}
		} while (entrada != 4);
	}

	public static void menu() {
		System.out.println("1. Circulo");
		System.out.println("2. Cuadrado");
		System.out.println("3. Triangulo equilatero");
		System.out.println("4. Salir");
	}

	public static void menu2() {
		System.out.println("1. Hallar Area");
		System.out.println("2. Hallar Perimetro");
	}

	public static double hallararea(double radio, double longitud, double base, double altura, int entrada) {
		if (entrada == 1) {
			return Math.PI * Math.pow(radio, 2);
		} else if (entrada == 2) {
			return Math.pow(longitud, 2);
		} else if (entrada == 3) {
			return (base * altura / 2);
		}
		return 0;
	}

	public static double hallarperimetro(double radio, double longitud, double base, double altura, int entrada) {
		if (entrada == 1) {
			return 2 * Math.PI * radio;
		} else if (entrada == 2) {
			return 4 * longitud;
		} else if (entrada == 3) {
			return 3 * base;
		}
		return 0;
	}
}
