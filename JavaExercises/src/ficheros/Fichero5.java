package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fichero5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre fichero");
		String ruta = sc.nextLine();
		// Declaramos el fichero con la clase File
		File fichero = new File(ruta);
		// Try para controlar los errores de acceso al fichero
		if (fichero.exists()) {
			System.out.println("El fichero ya existe");
		} else {
			System.out.println("Creando fichero");
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
