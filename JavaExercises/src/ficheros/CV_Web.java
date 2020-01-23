package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CV_Web {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int intro = 0;
		do {
			CV_Web.menu();
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				CV_Web.crearWeb();
				break;
			case 2:
				System.out.println("Saliendo...");
				break;
			}
		} while (intro != 2);

	}

	public static void menu() {
		System.out.println("1. Crear CV web");
		System.out.println("2. Salir");
	}

	public static void crearWeb() {
		String ruta = "cv.html";
		// Declaramos el fichero con la clase File
		File fichero = new File(ruta);
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce tu nombre y apellidos");
		String nombre = sc.nextLine();
		int siono = 0;
		int contador = 0;
		String titulos = "";
		do {
			System.out.println("¿Quieres introducir mas titulos? Si (1), No (2)");
			siono = sn.nextInt();
			switch (siono) {
			case 1:
				System.out.println("Introduce titulo");
				contador++;
				titulos = titulos + contador + ". " + sc.nextLine() + "<br>";
				break;
			case 2:
				break;
			}
		} while (siono != 2);
		siono = 0;
		contador = 0;
		String experiencia = "";
		do {
			System.out.println("Quieres introducir mas experiencia laboral? Si (1), No (2)");
			siono = sn.nextInt();
			switch (siono) {
			case 1:
				System.out.println("Introduce experiencia laboral");
				contador++;
				experiencia = experiencia + contador + ". " + sc.nextLine() + "<br>";
				break;
			case 2:
				break;
			}
		} while (siono != 2);
		System.out.println("Introduce otra informacion adicional");
		String adicional = sc.nextLine();
		String linea = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "	<title>CV</title>\r\n" + "</head>\r\n"
				+ "<body>\r\n" + "	<h1>CV de " + nombre + "</h1>\r\n" + "	<h2>Titulos</h2>\r\n" + "	<p>" + titulos
				+ "</p>\r\n" + "	<h2>Experiencia laboral</h2>\r\n" + "<p>" + experiencia + "</p>\r\n"
				+ "	<h2>Información adicional</h2>\r\n" + "</body>\r\n" + "</html>";
		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));

			bw.write(linea);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
