package ficheros;

import java.io.File;

public class Fichero4 {

	public static void main(String[] args) {
		try {

			// Create a file object
			File f = new File("Z:\\git\\JavaExercises\\JavaExercises\\src");

			// Get all the names of the files present
			// in the given directory
			String[] files = f.list();

			System.out.println("Files are:");

			// Display the names of the files
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
