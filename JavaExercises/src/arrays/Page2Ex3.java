package arrays;

public class Page2Ex3 {

	public static void main(String[] args) {
		int numeros[] = { 1, 2, 3, 4, 5 };
		int contadorinvertido = 0;
		int numerosinvertidos[] = new int[5];
		for (int i = numeros.length-1; 0 <= i; i--) {
			numerosinvertidos[contadorinvertido] = numeros[i];
			contadorinvertido++;
		}
		for (int i = 0; i < numerosinvertidos.length; i++) {
			System.out.print(numerosinvertidos[i]);
		}
	}

}
