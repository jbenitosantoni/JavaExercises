package peliculas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String ruta = "peliculas.txt";
		File fichero = new File(ruta);
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		int intro = 0;
		do {
			menu();
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				System.out.println("Introduce codigo pelicula");
				int codigo = sn.nextInt();
				System.out.println("Introduce nombre pelicula");
				String nombre = sc.nextLine();
				System.out.println("Introduce año pelicula");
				int año = sn.nextInt();
				System.out.println("Introduce nombre actor protagonista");
				String actor = sc.nextLine();
				System.out.println("Introduce coste produccion");
				int coste = sn.nextInt();
				Main.altapelicula(codigo, nombre, año, actor, coste, ruta, peliculas);
				break;
			case 2:
				System.out.println("Introduce codigo pelicula");
				codigo = sn.nextInt();
				Main.bajapelicula(codigo, ruta, peliculas);
				break;
			case 3:
				Main.consultaTodas(peliculas);
				break;
			case 4:
				System.out.println("Introduce codigo");
				int codigointro = sn.nextInt();
				System.out.println(Main.consultaConcreta(codigointro, peliculas).toString());
				break;
			}
		} while (intro != 4);
	}

	public static void menu() {
		System.out.println("1. Alta Pelicula");
		System.out.println("2. Baja Pelicula");
		System.out.println("3. Consulta de todas las peliculas");
		System.out.println("4. Consulta de dato de una pelicula por cod_pelicula");
		System.out.println("5. Salir");
	}

	public static void bajapelicula(int codigo, String ruta, ArrayList<Pelicula> peliculas) {
		for (int i = 0; i < peliculas.size(); i++) {
			if (peliculas.get(i).getCodigo() == codigo) {
				peliculas.remove(i);
			}
		}
	}

	public static void leerArrayList(ArrayList<Pelicula> peliculas, String ruta) {
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			Boolean dentro = false;
			if (dentro = false) {
				linea = br.readLine();
			}
			while (linea != null) {
				dentro = true;
				String[] lineasplit = linea.split("\\|\\");
				Pelicula peli = new Pelicula(Integer.parseInt(lineasplit[0]), lineasplit[1],
						Integer.parseInt(lineasplit[2]), lineasplit[3], Integer.parseInt(lineasplit[2]));
				peliculas.add(peli);
				linea = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void consultaTodas(ArrayList<Pelicula> peliculas) {
		for (int i = 0; i < peliculas.size(); i++) {
			System.out.println(peliculas.get(i).toString());
		}
	}

	public static Pelicula consultaConcreta(int codigointro, ArrayList<Pelicula> peliculas) {
		for (int i = 0; i < peliculas.size(); i++) {
			if (peliculas.get(i).getCodigo() == codigointro) {
				return peliculas.get(i);
			}
		}
		return null;
	}

	public static void altapelicula(int codigo, String nombre, int año, String actor, int coste, String ruta,
			ArrayList<Pelicula> peliculas) {
		Pelicula peli = new Pelicula(codigo, nombre, año, actor, coste);
		peliculas.add(peli);
	}
}