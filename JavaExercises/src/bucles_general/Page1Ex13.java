package bucles_general;

public class Page1Ex13 {

	public static void main(String[] args) {
		int tabla = 1;
		while (tabla < 5) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i + "*" + tabla + "=" + i * tabla);
			}
			tabla++;
		}

	}

}
