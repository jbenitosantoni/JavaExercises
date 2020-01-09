package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichero2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ficheros = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce nombre fichero " + i);
			ficheros.add(sc.nextLine());
		}
		for (int i = 0; i < ficheros.size(); i++) {
			File fichero = new File(ficheros.get(i));
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
