package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Generador_Webs {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int intro = 0;
		do {
			menu();
			switch (intro) {
			case 1:
				Generador_Webs.crearWeb();
				break;
			case 2:
				System.out.println("Saliendo...");
			}
			intro = sn.nextInt();
		} while (intro != 2);

	}

	public static void menu() {
		System.out.println("1. Crear pagina web");
		System.out.println("2. Salir");
	}

	public static void crearWeb() {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre para el archivo html");
		String ruta = sc.nextLine() + ".html";
		File fichero = new File(ruta);
		System.out.println("Introduce titulo página");
		String titulo = sc.nextLine();
		System.out.println("introduce primera linea de body");
		String body = "<h1>" + sc.nextLine() + "</h1>";
		System.out.println("Elige una imagen introduciendo un numero de 1 a 5");
		String imagen = sc.nextLine() + ".png";
		String web = "<!DOCTYPE html><html><head><title>" + titulo + "</title></head><body>" + body + "<img src=\""
				+ imagen + "\"></body></html>";
		Generador_Webs.crearArchivo(web, ruta);
	}

	public static void crearArchivo(String web, String ruta) {
		String linea = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			bw.write(web);
			bw.newLine();
			bw.close();
			System.out.println("Web Creada!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
