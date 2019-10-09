package condicionales;

import java.util.Scanner;

public class Page2Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		int num = sc.nextInt();
		 String decena = null;
		 String unidad = null;
		if ((num / 10 == 1) && (num % 10 == 1)) {
			unidad = "once";
		} else if ((num / 10 == 1) && (num % 10 == 2)) {
			unidad = "doce";
		} else if ((num / 10 == 1) && (num % 10 == 3)) {
			unidad = "trece";
		} else if ((num / 10 == 1) && (num % 10 == 4)) {
			unidad = "catorce";
		} else if ((num / 10 == 1) && (num % 10 == 5)) {
			unidad = "quince";
		} else if ((num / 10 == 1) && (num % 10 <= 6)) {
			 decena = "dieci";
		} else if ((num / 10 == 2) && (num % 10 == 0)) {
			unidad = "veinte";
		}  else if ((num / 10 == 2) && (num % 10 > 0)) {
			 decena = "veinti";
		} else if ((num / 10 == 3) && (num % 10 == 0)) {
			unidad = "treinta";
		}  else if ((num / 10 == 3) && (num % 10 > 0)) {
			 decena = "treinta y ";
		}  else if ((num / 10 == 4) && (num % 10 == 0)) {
			unidad = "cuarenta";
		}  else if ((num / 10 == 4) && (num % 10 > 0)) {
			 decena = "cuarenta y ";
		}  else if ((num / 10 == 5) && (num % 10 == 0)) {
			unidad = "cincuenta";
		}  else if ((num / 10 == 5) && (num % 10 > 0)) {
			 decena = "cincuenta y ";
		}  else if ((num / 10 == 6) && (num % 10 == 0)) {
			unidad = "sesenta";
		}  else if ((num / 10 == 6) && (num % 10 > 0)) {
			 decena = "sesenta y ";
		}   else if ((num / 10 == 7) && (num % 10 == 0)) {
			unidad = "setenta";
		}  else if ((num / 10 == 7) && (num % 10 > 0)) {
			 decena = "setenta y ";
		}  else if ((num / 10 == 8) && (num % 10 == 0)) {
			unidad = "ochenta";
		}  else if ((num / 10 == 8) && (num % 10 > 0)) {
			 decena = "ochenta y ";
		}   else if ((num / 10 == 9) && (num % 10 == 0)) {
			unidad = "noventa";
		}  else if ((num / 10 == 9) && (num % 10 > 0)) {
			 decena = "noventa y ";
		} if (num % 10 == 1) {
			 unidad = "uno";
		} else if (num % 10 == 2) {
			 unidad = "dos";
		} else if (num % 10 == 3) {
			 unidad = "tres";
		} else if (num % 10 == 4) {
			 unidad = "cuatro";
		} else if (num % 10 == 5) {
			 unidad = "cinco";
		} else if (num % 10 == 6) {
			 unidad = "seis";
		} else if (num % 10 == 7) {
			 unidad = "siete";
		} else if (num % 10 == 8) {
			 unidad = "ocho";
		} else if (num % 10 == 9) {
			 unidad = "nueve";
		}
		if (decena != null) {
			System.out.print("El número " + num + " con letras es: " + decena + unidad);	
		} else {
			System.out.print("El número " + num + " con letras es: " + unidad);
		}

	}
}