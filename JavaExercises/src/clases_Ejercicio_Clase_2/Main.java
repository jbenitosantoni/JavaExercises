package clases_Ejercicio_Clase_2;

public class Main {

	public static void main(String[] args) {
		Mvp[] jugadores = new Mvp[2];
		Mvp jugador1 = new Mvp("Javier", "a", "b", 5, 8, 3, 4, "a", "b");
		jugadores[0] = jugador1;
		System.out.println(jugadores[0].dameEficiencia());
		System.out.println(jugadores[0].toString());

	}

}
