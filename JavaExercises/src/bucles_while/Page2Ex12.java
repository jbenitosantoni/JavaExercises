package bucles_while;

public class Page2Ex12 {

	public static void main(String[] args) {
		int impar = 1;
		int i = 0;
		int producto = 1;
		while (i < 9) {
			producto = producto * (impar + 2);
			impar = impar + 2;
			i++;
		}
		System.out.print(producto);
	}

}
