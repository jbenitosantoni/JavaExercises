import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce numero de tarjeta");
		Long tarjeta1 = scan.nextLong();
		System.out.println("Introduce numero de tarjeta");
		Long tarjeta2 = scan.nextLong();
		System.out.println("Introduce numero de tarjeta");
		Long tarjeta3 = scan.nextLong();
		System.out.println("Introduce numero de tarjeta");
		Long tarjeta4 = scan.nextLong();
		System.out.println("Introduce numero de tarjeta");
		Long tarjeta5 = scan.nextLong();

		System.out.print("Tarjeta 5: " + tarjeta5 + "\nTarjeta 4: " + tarjeta4 + "\nTarjeta 3: " + tarjeta3
				+ "\nTarjeta 2: " + tarjeta2 + "\nTarjeta 1: " + tarjeta1);
		}
	}
