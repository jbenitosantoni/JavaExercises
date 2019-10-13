package arrays;

import java.util.concurrent.ThreadLocalRandom;

public class Page4Ex5 {

	public static void main(String[] args) {
		int array[] = new int[50];
		for (int i = 0; i < array.length; i++) {
			array[i] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		}
	}

}
