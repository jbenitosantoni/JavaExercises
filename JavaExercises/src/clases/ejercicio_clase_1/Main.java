package clases.ejercicio_clase_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce nombre alumno: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce apellidos alumno: ");
		String apellidos = sc.nextLine();
		System.out.println("Introduce n_expediente alumno: ");
		String n_expediente = sc.nextLine();
		System.out.println("Introduce dni alumno: ");
		String dni = sc.nextLine();
		System.out.println("Introduce edad alumno: ");
		int edad = sn.nextInt();
		System.out.println("Introduce nota alumno: ");
		Double nota = sn.nextDouble();

		Alumno alumno3 = new Alumno(nombre, apellidos, n_expediente, dni, edad, nota);
		alumno3.mostrarDatos();
		if (alumno3.aprobado() == true) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspenso");
		}
		sc.close();
		sn.close();

	}

}
