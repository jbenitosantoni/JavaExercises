import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserta un número");
		int num1 = scan.nextInt();
		System.out.println("Inserta otro número");
		int num2 = scan.nextInt();
		int resultado = (int) Math.pow(num1,num2);
		System.out.print("El primer número elevado al segundo: " + resultado);
	}

}
