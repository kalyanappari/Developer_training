package fileHandling;

import java.io.File;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) throws IOException{
		
		File file1 = new File("abc.txt");
		
		if(file1.createNewFile()) {
			System.out.println("File Created!");
		}
		else {
			System.out.println("File Already Exists!");
		}
	}

}