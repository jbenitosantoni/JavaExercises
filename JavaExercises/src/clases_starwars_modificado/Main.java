package clases_starwars_modificado;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Scanner sm = new Scanner(System.in);
		Padawan[] padawans = new Padawan[5];
		Jedi[] jedis = new Jedi[2];
		String nombre = "";
		int edad = 0;
		int fuerza = 0;
		int potencial = 0;
		String planeta = "";
		String color_laser = "";
		int intro = 0;
		String buscarnombre = "";
		int valoruser = 0;
		boolean nombrejediexiste = false;
		Funciones.pedir(padawans, buscarnombre, edad, fuerza, potencial, planeta, jedis, color_laser);
		do {
			Funciones.menu();
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				Funciones.case1(jedis);
				break;
			case 2:
				Funciones.case2(padawans);
				break;
			case 3:
				Funciones.case3(buscarnombre, nombrejediexiste, jedis);
				break;
			case 4:
				Funciones.case4(buscarnombre, padawans);
				break;
			case 5:
				Funciones.case5(valoruser, padawans, jedis);
				break;
			case 6:
				Funciones.case6(jedis);
				break;
			case 7:
				Funciones.case7(padawans);
				break;
			case 8:
				Funciones.case8(padawans);
				break;
			case 9:
				Funciones.case9(jedis);
				break;
			case 10:
				Funciones.case10(padawans);
				break;
			}
		} while (intro != 11);
		sc.close();
		sn.close();
		sm.close();
	}

}
