package arrays;

import java.util.Scanner;

public class Page3Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numeros[] = new double[10];
		double suma = 0;
		for(int i = 0; i < numeros.length; i++){
			numeros[i] = sc.nextDouble();
		}
		for(int i = 0; i < numeros.length; i++){
			suma = suma + numeros[i];
		}
		System.out.print(suma);
	}

}
