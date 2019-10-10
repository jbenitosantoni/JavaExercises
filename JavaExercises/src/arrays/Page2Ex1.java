package arrays;

public class Page2Ex1 {

	public static void main(String[] args) {
		int numeros[] = new int[100];
		int suma = 0;
		int media = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		for (int i = 0; i < numeros.length; i++) {
			suma = numeros[i] + suma;
		}
		for (int i = 0; i < numeros.length; i++) {
			media = (numeros[i] + media);
		}
		media = media / numeros.length;
		System.out.print("Suma de todos los números: " + suma);
		System.out.print("Media de todos los números: " + media);
	}

}
