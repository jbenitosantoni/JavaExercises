package pruebaficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String ruta = "archivo.txt";
		String linea = "";
		File fichero = new File(ruta);
		int contador = 0;
		ArrayList<String> libro = new ArrayList<String>();
		ArrayList<String> pares = new ArrayList<String>();
		ArrayList<String> impares = new ArrayList<String>();
		if (fichero.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				linea = br.readLine();
				while (linea != null) {
					contador++;
					if (contador % 2 == 0 || contador == 0) {
						pares.add(linea);
					}
					if (contador % 2 != 0) {
						impares.add(linea);
					}
					linea = br.readLine();
					libro.add(linea);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			// El fichero no existe asi que lo creamos
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
		for (int i = 0; i < libro.size(); i++) {
			System.out.println(libro.get(i));
		}
	}
}
