package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Peliculas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String ruta = "peliculas.txt";
		String linea = "";
		int intro = 0;
		ArrayList<String> peliculas = new ArrayList<String>();
		File fichero = new File(ruta);
		if (fichero.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				linea = br.readLine();
				while (linea != null) {
					peliculas.add(linea);
					linea = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		do {
			Peliculas.menu();
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < peliculas.size(); i++) {
					System.out.println(peliculas.get(i));
				}
				break;
			case 2:
				peliculas.clear();
				break;
			case 3:
				System.out.println("Introduce nombre pelicula");
				for (int i = 0; i < peliculas.size(); i++) {
					if (peliculas.get(i).equalsIgnoreCase(sc.nextLine())) {
						peliculas.remove(i);
						System.out.println("Eliminada");
					}
				}
				break;
			case 4:
				System.out.println("Introduce nombre pelicula");
				peliculas.add(sc.nextLine());
				break;
			case 5:
				System.out.println("Introduce letra");
				char aux = sc.next().charAt(0);
				for (int i = 0; i < peliculas.size(); i++) {
					if (peliculas.get(i).charAt(0) == aux) {
						System.out.println(peliculas.get(i));
					}
				}
				break;
			case 6:
				System.out.println("Introduce letra");
				char aux2 = sc.next().charAt(0);
				System.out.println("Introduce veces");
				int veces = sn.nextInt();
				Peliculas.PeliculaLetrasVeces(peliculas, aux2, veces);
				break;
			case 7:
				Peliculas.guardar(ruta, peliculas);
				break;
			}
		} while (intro != 7);

	}

	public static void guardar(String ruta, ArrayList<String> peliculas) {
		try {
			String linea = "";
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			for (int i = 0; i < peliculas.size(); i++) {
				linea = peliculas.get(i);
				bw.write(linea);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void PeliculaLetrasVeces(ArrayList<String> peliculas, char aux2, int veces) {
		int contador = 0;
		for (int i = 0; i < peliculas.size(); i++) {
			for (int z = 0; z < peliculas.get(i).length(); z++) {
				if (peliculas.get(i).charAt(z) == aux2) {
					contador++;
				}
			}
			if (contador >= veces) {
				System.out.println(peliculas.get(i));
			}
			contador = 0;
		}
	}

	public static void menu() {
		System.out.println("SELECCIONA UNA OPCION DEL MENU");
		System.out.println("1. Mostrar todas las peliculas");
		System.out.println("2. Eliminar todas las peliculas");
		System.out.println("3. Eliminar una pelicula");
		System.out.println("4. Insertar una pelicula");
		System.out.println("5. Mostrar peliculas que empiezen por una letra");
		System.out.println("6. Mostrar peliculas que contengan una letra x veces");
		System.out.println("7. Salir");

	}
}
