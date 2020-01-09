package pruebaficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ruta = "archivo.txt";
		String linea = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			for (int i = 0; i < 2; i++) {
				System.out.println("Introduce nombre peli");
				String peliculas = sc.nextLine();
				bw.write(peliculas);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
