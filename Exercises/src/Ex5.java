import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserta un n�mero");
		int num1 = scan.nextInt();
		System.out.println("Inserta otro n�mero");
		int num2 = scan.nextInt();
		System.out.println("Inserta otro n�mero");
		int num3 = scan.nextInt();
		System.out.println("Inserta otro n�mero");
		int num4 = scan.nextInt();
		int resultado = num1 - num2 - num3 - num4;
		System.out.print("El primer n�mero menos los 3 siguientes es igual a: " + resultado);
	}

}
