package switches;

import java.util.Scanner;

public class Day1Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dia de la semana");
		int dia = sc.nextInt();
		switch (dia) {
		case 1:
			System.out.print("Lunes");
			break;
		case 2:
			System.out.print("Martes");
			break;
		case 3:
			System.out.print("Miercoles");
			break;
		case 4:
			System.out.print("Jueves");
			break;
		case 5:
			System.out.append("Viernes");
			break;
		case 6:
			System.out.print("Sábado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
		default:
			System.out.print("Introduce un número del 1-7 que corresponda a un día de la semana");
			break;
		}

	}

}