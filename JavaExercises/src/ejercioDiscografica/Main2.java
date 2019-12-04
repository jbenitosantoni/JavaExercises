package ejercioDiscografica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cancion> cancionesPrincipal = new ArrayList<Cancion>();
		ArrayList<Disco> discos = new ArrayList<Disco>();
		Main2.rellenarCanciones(cancionesPrincipal);
		Main2.mostrarMenu();
		int intro = sc.nextInt();
		do {
			switch (intro) {
			case 1:
				Main2.rellenarDiscos(cancionesPrincipal, discos);
				break;
			case 2:
				Main2.mostrarCancionesEnDisco(discos);
				break;
			case 3:
				Main2.discoCancion(discos);
				break;
			case 4:
				Main2.titulosLetra(discos);
				break;
			case 5:
				Main2.discoMayorDuracion(discos);
				break;
			}
		} while (intro != 6);
	}

	public static void rellenarCanciones(ArrayList<Cancion> canciones) {
		canciones.add(new Cancion("La mujer de verde", 2.1));
		canciones.add(new Cancion("Copacabana", 3.9));
		canciones.add(new Cancion("Pausa", 3));
		canciones.add(new Cancion("Que bien", 3));
		canciones.add(new Cancion("Panico Practico", 3.6));
		canciones.add(new Cancion("El pozo", 3));
		canciones.add(new Cancion("La increible historia del hombre que no sabia volar", 3));
		canciones.add(new Cancion("Autoterapia", 4.3));
		canciones.add(new Cancion("Bill Murray", 1));
		canciones.add(new Cancion("El baile", 6));
		canciones.add(new Cancion("Magia y efectos especiales", 4));
		canciones.add(new Cancion("Pequeña gran revolucion", 2));
	}

	public static Disco discoMayorDuracion(ArrayList<Disco> discos) {
		double suma1 = 0;
		double suma2 = 0;
		double suma3 = 0;
		for (int i = 0; i < discos.get(0).getCanciones().size(); i++) {
			suma1 = suma1 + discos.get(0).getCanciones().get(i).getDuracion();
		}
		for (int i = 0; i < discos.get(1).getCanciones().size(); i++) {
			suma2 = suma2 + discos.get(1).getCanciones().get(i).getDuracion();
		}
		for (int i = 0; i < discos.get(2).getCanciones().size(); i++) {
			suma2 = suma2 + discos.get(2).getCanciones().get(i).getDuracion();
		}
		if (suma1 > suma2 && suma1 > suma3) {
			return discos.get(0);
		} else if (suma2 > suma1 && suma2 > suma3) {
			return discos.get(1);
		} else if (suma3 > suma1 && suma3 > suma2) {
			return discos.get(2);
		} else {
			return null;
		}
	}

	public static ArrayList<Disco> titulosLetra(ArrayList<Disco> discos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primera letra disco");
		String letra1 = sc.nextLine();
		char letra = letra1.charAt(0);
		ArrayList<Disco> salida = new ArrayList<Disco>();
		for (int i = 0; i < discos.size(); i++) {
			if (discos.get(i).getTitulo().charAt(0) == letra) {
				salida.add(discos.get(i));
			}
		}
		return salida;
	}

	public static String discoCancion(ArrayList<Disco> discos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nombre cancion");
		String nombre = sc.nextLine();
		int indice = 0;
		Boolean existe = false;
		for (int i = 0; i < discos.size(); i++) {
			if (nombre.equalsIgnoreCase(discos.get(i).getTitulo())) {
				indice = i;
				existe = true;
			}
		}
		if (existe == true) {
			return discos.get(indice).getTitulo();
		} else {
			return "Cancion no existe";
		}
	}

	public static ArrayList<Cancion> mostrarCancionesEnDisco(ArrayList<Disco> discos) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona disco 1, 2 o 3");
		int intro = sc.nextInt();
		if (intro == 1) {
			return discos.get(0).getCanciones();
		} else if (intro == 2) {
			return discos.get(1).getCanciones();
		} else {
			return discos.get(2).getCanciones();
		}
	}

	public static void rellenarDiscos(ArrayList<Cancion> canciones, ArrayList<Disco> discos) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int contador = 0;
		ArrayList<Cancion> seleccion1 = new ArrayList<Cancion>();
		ArrayList<Cancion> seleccion2 = new ArrayList<Cancion>();
		ArrayList<Cancion> seleccion3 = new ArrayList<Cancion>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce Titulo disco");
			String titulo = sc.nextLine();
			System.out.println("Introduce Año Publicacion disco");
			int año = sn.nextInt();
			System.out.println("Introduce codigo disco");
			int codigo = sn.nextInt();
			System.out.println("Introduce productor");
			String productor = sc.nextLine();
			System.out.println("Selecciona canciones");
			for (int j = 0; j < canciones.size(); j++) {
				System.out.println(j + " " + canciones.get(j).getTitulo());
				if (j == canciones.size() - 1) {
					if (contador == 0) {
						for (int z = 0; z < 3; z++) {
							System.out.println("Selecciona canciones");
							seleccion1.add(canciones.get(sn.nextInt()));
						}
						discos.add(new Disco(titulo, año, codigo, productor, seleccion1));
						contador++;
					} else if (contador == 1) {
						for (int z = 0; z < 3; z++) {
							System.out.println("Selecciona canciones");
							seleccion2.add(canciones.get(sn.nextInt()));
						}
						discos.add(new Disco(titulo, año, codigo, productor, seleccion2));
						contador++;
					} else if (contador == 2) {
						for (int z = 0; z < 3; z++) {
							System.out.println("Selecciona canciones");
							seleccion3.add(canciones.get(sn.nextInt()));
						}
						discos.add(new Disco(titulo, año, codigo, productor, seleccion3));
						contador++;
					}
				}
			}
		}
	}

	public static void mostrarMenu() {
		System.out.println("1. Crear disco 1, 2, 3 y meterlo en el arrayList.");
		System.out.println("2. Mostrar los datos y las canciones de disco");
		System.out.println("3. Mostrar titulo de cancion");
		System.out.println("4. Mostrar canciones que empiecen por letra dada");
		System.out.println("5. Mostrar datos disco mayor duracion");
		System.out.println("6. Salir");
	}
}
