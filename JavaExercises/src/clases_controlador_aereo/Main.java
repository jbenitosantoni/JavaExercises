package clases_controlador_aereo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Controlador[] controlador = new Controlador[10];
		Aerolinea[] aerolinea = new Aerolinea[10];
		Avion[] avion = new Avion[10];
		Vuelo[] vuelo = new Vuelo[10];
		RellenarControladores.RellenarControladores(controlador);
		RellenarAviones.RellenarAviones(avion);
		RellenarVuelos.RellenarVuelos(vuelo);
		RellenarAerolineas.RellenarAerolineas(aerolinea);
	}

}
