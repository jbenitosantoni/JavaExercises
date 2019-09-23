package Condicionales;

import java.util.Scanner;

public class Page3Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu sueldo");
		double sueldo = sc.nextDouble();
		String irpf = "0";
		if (sueldo < 700) {
			irpf = "2%";
		} else if (sueldo >= 700 && sueldo <=1000) {
			irpf = "4%";
		} else if (sueldo > 1000 && sueldo <= 2000) {
			irpf = "10%";
		} else if (sueldo > 2000) {
			irpf = "45%";
		}
		System.out.print("El IRPF que se aplica a tu sueldo es de: " + irpf);
	}

}
