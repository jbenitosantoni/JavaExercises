package bucles_while;

public class Page1Ex3 {

	public static void main(String[] args) {
		int i = 100;
		while (i <= 800 && i >= 100) {
			if (i % 5 == 0) {
				System.out.print(i + ", ");
			}
			i++;
		}
	}
}
