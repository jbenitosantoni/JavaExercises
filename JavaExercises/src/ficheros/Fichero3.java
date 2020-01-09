package ficheros;

import java.io.File;
import java.io.IOException;

public class Fichero3 {

	public static void main(String[] args) {
		String nombre = "";
		for (int i = 0; i < 100; i++) {
			nombre = i + 1 + ".txt";
			File fichero = new File(nombre);
			if (fichero.exists()) {
				System.out.println("El fichero ya existe");
			} else {
				System.out.println("Creando fichero");
				try {
					fichero.createNewFile();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
