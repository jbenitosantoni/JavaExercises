import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce tu nombre");
			String nombre = scan.nextLine();
			System.out.println("Introduce tus apellidos");
			String apellidos = scan.nextLine();
			System.out.println("Introduce tu edad");
			int edad = scan.nextInt();
			System.out.println("Introduce tu telefono");
			long telefono = scan.nextLong();
			System.out.print("Tienes " + edad + " años, te llamas " + nombre + " y te apellidas " + apellidos
					+ ", tu número de telefono es " + telefono);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Debes de introducir solo números.");
		}
	}
}