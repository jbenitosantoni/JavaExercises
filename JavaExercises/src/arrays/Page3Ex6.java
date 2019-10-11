package arrays;

public class Page3Ex6 {

	public static void main(String[] args) {
		int dado[] = new int[5000];
		int seis = 0;
		int uno = 0;
		for (int i = 0; i < dado.length; i++) {
			dado[i] = (int) (Math.random() * 6);
		}
		for (int i = 0; i < dado.length; i++) {
			if (dado[i] == 6) {
				seis++;
			} else if (dado[i] == 1) {
				uno++;
			}
		}
	}

}
