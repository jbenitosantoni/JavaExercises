package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ficheros1 {

	public static void main(String[] args) {
		String ruta = "edades.txt";
		File fichero = new File(ruta);
		ArrayList<Integer> mayoredad = new ArrayList<Integer>();
		ArrayList<Integer> menoredad = new ArrayList<Integer>();
		String linea = "";
		if (fichero.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				linea = br.readLine();
				while (linea != null) {
					if (Integer.parseInt(linea) < 18) {
						menoredad.add(Integer.parseInt(linea));
					} else {
						mayoredad.add(Integer.parseInt(linea));
					}
					linea = br.readLine();
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
		System.out.println("Menores Edad: ");
		for (int i = 0; i < menoredad.size(); i++) {
			System.out.println(menoredad.get(i));
		}
		System.out.println("Mayores Edad: ");
		for (int i = 0; i < mayoredad.size(); i++) {
			System.out.println(mayoredad.get(i));
		}
	}

}
