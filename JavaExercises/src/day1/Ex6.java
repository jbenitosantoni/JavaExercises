package day1;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nota Mates");
		double mates = sc.nextDouble();
		System.out.println("Nota Ciencias");
		double ciencias = sc.nextDouble();
		System.out.println("Nota Tecnologia");
		double tecnologia = sc.nextDouble();
		System.out.println("Nota Lengua");
		double lengua = sc.nextDouble();
		System.out.println("Nota Historia");
		double historia = sc.nextDouble();
		System.out.println("Nota Religion");
		double religion = sc.nextDouble();
		double mediaciencias = (mates + ciencias + tecnologia) / 3;
		double medialetras = (lengua + historia + religion) / 3;
		System.out.print("La media de ciencias es: " + mediaciencias + "\nLa media de letras es: " + medialetras);

	}

}
