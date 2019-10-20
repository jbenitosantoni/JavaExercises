package arrays_bidimensionales;

public class Page1Ex1 {

	public static void main(String[] args) {
		int array [][] = new int [5][4];
		int numero = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = numero;
				numero++;
			}
		}

	}

}
