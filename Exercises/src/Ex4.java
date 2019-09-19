import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce Nombre");
		String nombre = scan.nextLine();
		System.out.println("Introduce Apellidos");
		String apellidos = scan.nextLine();
		System.out.println("Introduce Telefono");
		long telefono = scan.nextLong();
		System.out.println("Introduce Tarjeta de Credito");
		long tarjeta = scan.nextLong();
		System.out.println("Introduce Direccion");
		String direccion = scan.nextLine();
		System.out.println("Introduce Ciudad");
		String ciudad = scan.nextLine();
		System.out.println("Introduce Codigo Postal");
		int cp = scan.nextInt();
		System.out.println("Introduce Pais");
		String pais = scan.nextLine();
		System.out.println("Introduce Centro de Estudios");
		String centro = scan.nextLine();
		System.out.println("Introduce DNI");
		String dni = scan.nextLine();

		System.out.print("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nTelefono: " + telefono + "\nTarjeta: "
				+ tarjeta + "\nDirección: " + direccion + "\nCodigo Postal: " + cp + "\nCiudad: " + ciudad + "\nPais: "+ pais + "\nCentro: "
				+ centro + "\nDNI: " + dni);
	}

}
