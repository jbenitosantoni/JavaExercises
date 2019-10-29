package strings;

import java.util.Scanner;

public class Page3Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número de telefono");
		String telefono = sc.nextLine();
		telefono = new StringBuffer(telefono).insert(0, "(").toString();
		telefono = new StringBuffer(telefono).insert(3, ")-").toString();
		telefono = new StringBuffer(telefono).insert(6, "-").toString();
		System.out.println(telefono);
		sc.close();

	}

}
