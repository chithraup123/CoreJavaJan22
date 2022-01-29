package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		String str = "File handling example program111";

		FileOutputStream outputStream;

		try {
			outputStream = new FileOutputStream("newFile.txt");
			outputStream.write(str.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println("Does not exist the file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		}
		

	}
}
