import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserta un número");
		int num1 = scan.nextInt();
		System.out.println("Inserta otro número");
		int num2 = scan.nextInt();
		System.out.println("Inserta otro número");
		int num3 = scan.nextInt();
		int resultado = num1 * (num2 + num3);
		System.out.print("El primer número multiplicado por la suma de los dos siguientes: " + resultado);
	}

}
