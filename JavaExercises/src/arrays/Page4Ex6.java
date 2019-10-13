package arrays;

import java.util.concurrent.ThreadLocalRandom;

public class Page4Ex6 {

	public static void main(String[] args) {
		int array[] = new int[1000];
		int uno = 0;
		int dos = 0;
		int tres = 0;
		int cuatro = 0;
		int cinco = 0;
		int seis = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = ThreadLocalRandom.current().nextInt(1, 6 + 1);
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				uno++;
			} else if (array[i] == 2) {
				dos++;
			} else if (array[i] == 3) {
				tres++;
			} else if (array[i] == 4) {
				cuatro++;
			} else if (array[i] == 5) {
				cinco++;
			} else if (array[i] == 6) {
				seis++;
			}
		}
		System.out.print("Unos: " + uno + "\nDoses: "+ dos + "\nTreses: " + tres + "\nCuatros: " + cuatro + "\nCincos: " + cinco + "\nSeises: " + seis);
	}

}
