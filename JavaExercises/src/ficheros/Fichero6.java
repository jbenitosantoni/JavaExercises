package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Fichero6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File fichero = new File("listadoGS.txt");
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
		System.out.println("Introduce nuevo nombre");
		File nueva = new File(sc.nextLine());
		if (fichero.renameTo(nueva)) {
			System.out.println("Nombre cambiado");
		} else {
			System.out.println("Error al cambiar nombre");
		}
	}

}
