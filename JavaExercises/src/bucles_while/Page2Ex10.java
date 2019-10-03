package bucles_while;

import java.util.Scanner;

public class Page2Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor máximo");
		double max = sc.nextDouble();
		System.out.println("Valor mínimo");
		double min = sc.nextDouble();
		System.out.println("Introduce número entre valor maximo y minimo");
		double valor = sc.nextDouble();
		while (valor < min || valor > max) {
			System.out.println("Has fallado, introduce número entre valor maximo y minimo");
			valor = sc.nextDouble();
		}
		sc.close();
	}
}