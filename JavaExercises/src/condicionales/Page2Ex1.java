package condicionales;

import java.util.Scanner;

public class Page2Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 7");
		int num1 = sc.nextInt();
		if (num1 >= 1 && num1 <= 7) {
			if (num1 == 1) {
				System.out.println("El número corresponde a Lunes");
			} else if (num1 == 2) {
				System.out.println("El número corresponde a Martes");
			} else if (num1 == 3) {
				System.out.println("El número corresponde a Miercoles");
			}  else if (num1 == 4) {
				System.out.println("El número corresponde a Jueves");
			} else if (num1 == 5) {
					System.out.println("El número corresponde a Viernes");
			} else if (num1 == 6) {
				System.out.println("El número corresponde a Sabado");
			} else if (num1 == 7) {
				System.out.println("El número corresponde a Domingo");
			}
		} else {
			System.out.println("El número debe estar comprendido entre el 1 y el 7");
		}
	}

}
