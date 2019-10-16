package ejercicio_code_week;

import java.util.Scanner;

public class Tablero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a1[] = new String[10];
		String b1[] = new String[10];
		String c1[] = new String[10];
		String d1[] = new String[10];
		String e1[] = new String[10];
		String f1[] = new String[10];
		String g1[] = new String[10];
		String h1[] = new String[10];
		String i1[] = new String[10];
		String j1[] = new String[10];
		String a2[] = new String[10];
		String b2[] = new String[10];
		String c2[] = new String[10];
		String d2[] = new String[10];
		String e2[] = new String[10];
		String f2[] = new String[10];
		String g2[] = new String[10];
		String h2[] = new String[10];
		String i2[] = new String[10];
		String j2[] = new String[10];
		int coordenada1 = 0;
		int coordenada2 = 0;
		int intro = 8;
		do {
			System.out.println("1. Iniciar o Resetear");
			System.out.println("2. Colocar naves Alianza");
			System.out.println("3. Colocar naves Imperio");
			System.out.println("4. Atacar nave Alianza");
			System.out.println("5. Atacar nave Alianza");
			System.out.println("6. Dibujar tablas");
			System.out.println("7. Salir");
			intro = sc.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < a1.length; i++) {
					a1[i] = "0";
					b1[i] = "0";
					c1[i] = "0";
					d1[i] = "0";
					e1[i] = "0";
					f1[i] = "0";
					g1[i] = "0";
					h1[i] = "0";
					i1[i] = "0";
					j1[i] = "0";
					a2[i] = "0";
					b2[i] = "0";
					c2[i] = "0";
					d2[i] = "0";
					e2[i] = "0";
					f2[i] = "0";
					g2[i] = "0";
					h2[i] = "0";
					i2[i] = "0";
					j2[i] = "0";
				}
				break;
			case 6:
				System.out.println("\n");
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + a1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + b1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + c1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + d1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + e1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + f1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + g1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + h1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + i1[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + j1[i] + "_" + "|");
				}
				System.out.println("\n\n");
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + a2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + b2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + c2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + d2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + e2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + f2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + g2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + h2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + i2[i] + "_" + "|");
				}
				System.out.println();
				for (int i = 0; i < a1.length; i++) {
					System.out.print("_" + j2[i] + "_" + "|");
				}
				System.out.println("\n");
				break;
			case 2:
				for (int i = 0; i < 4; i++) {
					System.out.println("Dame 2 coordenadas de nave de alianza");
					coordenada1 = sc.nextInt();
					coordenada2 = sc.nextInt();
					if (coordenada2 == 0) {
						a1[coordenada1] = "H";
					} else if (coordenada2 == 1) {
						b1[coordenada1] = "H";
					} else if (coordenada2 == 2) {
						c1[coordenada1] = "H";
					} else if (coordenada2 == 3) {
						d1[coordenada1] = "H";
					} else if (coordenada2 == 4) {
						e1[coordenada1] = "H";
					} else if (coordenada2 == 5) {
						f1[coordenada1] = "H";
					} else if (coordenada2 == 6) {
						g1[coordenada1] = "H";
					} else if (coordenada2 == 7) {
						h1[coordenada1] = "H";
					} else if (coordenada2 == 8) {
						i1[coordenada1] = "H";
					} else if (coordenada2 == 9) {
						j1[coordenada1] = "H";
					}
				}
				break;
			case 3:
				for (int i = 0; i < 4; i++) {
					System.out.println("Dame 2 coordenadas de nave de alianza");
					coordenada1 = sc.nextInt();
					coordenada2 = sc.nextInt();
					if (coordenada2 == 0) {
						a2[coordenada1] = "H";
					} else if (coordenada2 == 1) {
						b2[coordenada1] = "H";
					} else if (coordenada2 == 2) {
						c2[coordenada1] = "H";
					} else if (coordenada2 == 3) {
						d2[coordenada1] = "H";
					} else if (coordenada2 == 4) {
						e2[coordenada1] = "H";
					} else if (coordenada2 == 5) {
						f2[coordenada1] = "H";
					} else if (coordenada2 == 6) {
						g2[coordenada1] = "H";
					} else if (coordenada2 == 7) {
						h2[coordenada1] = "H";
					} else if (coordenada2 == 8) {
						i2[coordenada1] = "H";
					} else if (coordenada2 == 9) {
						j2[coordenada1] = "H";
					}
				}
				break;
			}
		} while (intro != 7);
		{
		}
	}
}
