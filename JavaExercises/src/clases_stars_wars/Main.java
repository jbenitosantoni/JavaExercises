package clases_stars_wars;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Scanner sm = new Scanner(System.in);
		Padawan[] padawans = new Padawan[5];
		Jedi[] jedis = new Jedi[5];
		String nombre = "";
		int edad = 0;
		int fuerza = 0;
		int potencial = 0;
		String planeta = "";
		String color_laser = "";
		int intro = 0;
		String buscarnombre = "";
		int valoruser = 0;
		for (int i = 0; i < padawans.length; i++) {
			System.out.println("Introduce nombre");
			nombre = sc.nextLine();
			System.out.println("Introduce edad");
			edad = sn.nextInt();
			System.out.println("Introduce fuerza");
			fuerza = sn.nextInt();
			System.out.println("Introduce potencial");
			potencial = sn.nextInt();
			System.out.println("Introduce planeta");
			planeta = sc.nextLine();
			padawans[i] = new Padawan(nombre, edad, fuerza, potencial, planeta);
		}

		for (int i = 0; i < jedis.length; i++) {
			System.out.println("Jedi: " + i);
			System.out.println("Introduce nombre");
			nombre = sc.nextLine();
			System.out.println("Introduce edad");
			edad = sn.nextInt();
			System.out.println("Introduce fuerza");
			fuerza = sn.nextInt();
			System.out.println("Introduce planeta");
			planeta = sc.nextLine();
			System.out.println("Introduce color laser");
			color_laser = sc.nextLine();
			jedis[i] = new Jedi(nombre, edad, fuerza, planeta, color_laser);
		}
		do {
			System.out.println("1. Mostrar datos de todos los Jedis.");
			System.out.println("2. Mostrar datos de todos los Padawans.");
			System.out.println("3. Mostrar datos de 1 Jedi");
			System.out.println("4. Mostrar datos de 1 Padawan");
			System.out.println(
					"5. Mostrar un listado con los nombres de los padawans que tengan un potencial superior a un valor pedido al usuario.");
			System.out.println("6. Mostrar los datos de los 2 Jedis que tengan más nivel de fuerza.");
			System.out.println("7. Mostrar los datos del Padawan con menor potencial.");
			System.out.println(
					"8. Mostrar los datos de todos los Padawans que su nombre empiece o termine por una letra pedida al usuario.");
			System.out.println("9. Modifica todos los nombres de los Jedis y ponlos en mayúsculas.");
			System.out.println("10. Modifica los nombres de los padawans y ponlos todos en minúsculas.");
			System.out.println("11. Salir.");
			intro = sn.nextInt();
			switch (intro) {
			case 1:
				for (int i = 0; i < jedis.length; i++) {
					System.out.println(jedis[i].toString());
				}
				break;
			case 2:
				for (int i = 0; i < padawans.length; i++) {
					System.out.println(padawans[i].toString());
				}
				break;
			case 3:
				boolean nombrejediexiste = false;
				do {
					System.out.println("Introduce nombre");
					buscarnombre = sc.nextLine();
					for (int i = 0; i < jedis.length; i++) {
						if (buscarnombre.equalsIgnoreCase(jedis[i].getNombre())) {
							System.out.println(jedis[i].toString());
							nombrejediexiste = true;
						}
						if (!nombrejediexiste) {
							System.out.println("El nombre no existe.");
						}
					}
				} while (!nombrejediexiste);
				break;
			case 4:
				boolean nombrepadawanexiste = false;
				do {
					System.out.println("Introduce nombre");
					buscarnombre = sc.nextLine();
					for (int i = 0; i < padawans.length; i++) {
						if (buscarnombre.equalsIgnoreCase(padawans[i].getNombre())) {
							System.out.println(padawans.toString());
							nombrepadawanexiste = true;
						}
					}
				} while (!nombrepadawanexiste);
			case 5:
				System.out.println("Introduce valor");
				valoruser = sn.nextInt();
				for (int i = 0; i < padawans.length; i++) {
					if (valoruser < padawans[i].getPotencial()) {
						System.out.println(jedis[i].toString());
					}
				}
				break;
			case 6:
				int masfuerte = 0;
				int masfuerte2 = 0;
				for (int i = 1; i < jedis.length; i++) {
					if (jedis[i].getFuerza() > jedis[i - 1].getFuerza()) {
						masfuerte = i;
					}
					if (i != masfuerte) {
						if (jedis[i].getFuerza() > jedis[i - 1].getFuerza()) {
							masfuerte2 = i;
						}
					}
				}
				System.out.println(jedis[masfuerte].toString());
				System.out.println(jedis[masfuerte2].toString());
				break;
			case 7:
				int menorpotencial = 0;
				for (int i = 1; i < padawans.length; i++) {
					if (padawans[i].getPotencial() > padawans[i - 1].getPotencial()) {
						menorpotencial = i;
					}
				}
				System.out.println(padawans[menorpotencial].toString());
				break;
			case 8:
				System.out.println("Introduce letra");
				char letra = sm.next().charAt(0);
				for (int i = 0; i < padawans.length; i++) {
					if (letra == padawans[i].getNombre().charAt(0)
							|| letra == padawans[i].getNombre().charAt(padawans[i].getNombre().length())) {
						System.out.println(padawans[i].toString());
					}
				}
				break;
			case 9:
				for (int i = 0; i < jedis.length; i++) {
					jedis[i].setNombre(jedis[i].getNombre().toUpperCase());
				}
			case 10:
				for (int i = 0; i < padawans.length; i++) {
					padawans[i].setNombre(padawans[i].getNombre().toUpperCase());
				}
			}
		} while (intro != 11);
		sc.close();
		sn.close();
		sm.close();
	}

}
