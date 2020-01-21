package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zoologico_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String ruta = "zoo.txt";
		File fichero = new File(ruta);
		ArrayList<Animal_Salvaje> animalsalvaje = new ArrayList<Animal_Salvaje>();
		ArrayList<Animal_Domestico> animaldomestico = new ArrayList<Animal_Domestico>();
		Zoologico_Main.rellenar(animalsalvaje, animaldomestico, ruta);
		int intro = 0;
		do {
			menu();
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				Zoologico_Main.alta_Animal(animalsalvaje, animaldomestico);
				break;
			case 2:
				Zoologico_Main.baja_animal(animalsalvaje, animaldomestico);
				break;
			case 4:
				Zoologico_Main.comparardomestico(animaldomestico);
				break;
			}
		} while (intro != 6);
	}

	public static void menu() {
		System.out.println("1. Alta animal");
		System.out.println("2. Baja animal");
		System.out.println("3. Modificacion dato animal");
		System.out.println("4. Listado de todos los animales domesticos ordenados por edad");
		System.out.println("5. Listado de todos los animales salvajes y domesticos ordenados por peso");
		System.out.println("6. Salir");
	}

	public static void salvajes_domesticos(ArrayList<Animal_Domestico> animaldomestico,
			ArrayList<Animal_Salvaje> animalsalvaje) {

		for (int i = 0; i < animaldomestico.size(); i++) {
			if (animaldomestico.get(i).getPeso() < animaldomestico.get(i + 1).getPeso()) {

			}
		}

	}

	public static void comparardomestico(ArrayList<Animal_Domestico> animaldomestico) {
		int identifica = 0;
		Collections.sort(animaldomestico);
		for (Animal_Domestico str : animaldomestico) {
			System.out.println();
			System.out.println(str.toString());
		}
	}

	public static void baja_animal(ArrayList<Animal_Salvaje> animalsalvaje,
			ArrayList<Animal_Domestico> animaldomestico) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce id del animal");
		int intro = sc.nextInt();
		for (int i = 0; i < animalsalvaje.size(); i++) {
			if (animalsalvaje.get(i).getId_animal() == intro) {
				animalsalvaje.remove(intro);
				System.out.println("Animal salvaje eliminado");
			}
		}
		for (int i = 0; i < animaldomestico.size(); i++) {
			if (animaldomestico.get(i).getId_animal() == intro) {
				animaldomestico.remove(intro);
				System.out.println("Animal domestico eliminado");
			}
		}
	}

	public static void alta_Animal(ArrayList<Animal_Salvaje> animalsalvaje,
			ArrayList<Animal_Domestico> animaldomestico) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Animal domestico o salvaje");
		String respuesta = sc.nextLine();
		if (respuesta.equalsIgnoreCase("salvaje")) {
			System.out.println("Introduce id del animal");
			int id = sn.nextInt();
			System.out.println("Introduce altura del animal");
			double altura = sn.nextDouble();
			System.out.println("Introduce peso del animal");
			double peso = sn.nextDouble();
			System.out.println("Introduce edad del animal");
			int edad = sn.nextInt();
			System.out.println("Introduce nombre del animal");
			String nombre = sc.nextLine();
			System.out.println("Introduce especie del animal");
			String especie = sc.nextLine();
			System.out.println("Introduce nivel de fuerza del animal");
			int fuerza = sn.nextInt();
			Animal_Salvaje salvaje = new Animal_Salvaje(id, altura, peso, edad, nombre, especie, fuerza);
		} else if (respuesta.equalsIgnoreCase("domestico")) {
			System.out.println("Introduce id del animal");
			int id = sn.nextInt();
			System.out.println("Introduce altura del animal");
			double altura = sn.nextDouble();
			System.out.println("Introduce peso del animal");
			double peso = sn.nextDouble();
			System.out.println("Introduce edad del animal");
			int edad = sn.nextInt();
			System.out.println("Introduce nombre del animal");
			String nombre = sc.nextLine();
			System.out.println("Introduce especie del animal");
			String especie = sc.nextLine();

			System.out.println("Sonido que emite");
			String sonido = sc.nextLine();
			System.out.println("Propietario");
			String propietario = sc.nextLine();
			System.out.println("Introduce mimoso si el animal es mimoso o no mimoso si no lo es");
			String mimoso_string = sc.nextLine();
			if (mimoso_string.equalsIgnoreCase("mimoso")) {
				Boolean mimoso = true;
				Animal_Domestico domestico = new Animal_Domestico(id, altura, peso, edad, nombre, especie, mimoso,
						sonido, propietario);
			} else if (mimoso_string.equalsIgnoreCase("no mimoso")) {
				Boolean mimoso = false;
				Animal_Domestico domestico = new Animal_Domestico(id, altura, peso, edad, nombre, especie, mimoso,
						sonido, propietario);
			} else {
				System.out.println("Debes introducir o mimoso o no mimoso");
			}
		} else {
			System.out.println("Introduce domestico o salvaje");
		}
	}

	public static void rellenar(ArrayList<Animal_Salvaje> animalsalvaje, ArrayList<Animal_Domestico> animaldomestico,
			String ruta) {
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			linea = br.readLine();
			while (linea != null) {
				String[] lineasplit = linea.split("\\|");
				if (lineasplit[0].equalsIgnoreCase("domestico")) {
					Animal_Domestico domestico = new Animal_Domestico(Integer.parseInt(lineasplit[1]),
							Double.parseDouble(lineasplit[2]), Double.parseDouble(lineasplit[3]),
							Integer.parseInt(lineasplit[4]), lineasplit[5], lineasplit[6],
							Boolean.parseBoolean(lineasplit[7]), lineasplit[8], lineasplit[9]);
					animaldomestico.add(domestico);
					linea = br.readLine();
				} else if (lineasplit[0].equalsIgnoreCase("salvaje")) {
					Animal_Salvaje salvaje = new Animal_Salvaje(Integer.parseInt(lineasplit[1]),
							Double.parseDouble(lineasplit[2]), Double.parseDouble(lineasplit[3]),
							Integer.parseInt(lineasplit[4]), lineasplit[5], lineasplit[6],
							Integer.parseInt(lineasplit[7]));
					animalsalvaje.add(salvaje);
					linea = br.readLine();
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
