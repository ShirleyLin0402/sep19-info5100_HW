package Q2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class Q2 {
	public static void main(String[] args) throws Exception {
		File file = new File("\\Users\\Administrator\\Desktop\\5100.txt");
		//FileInputStream fis = new FileInputStream(file);
		String s = null;
		String decode = null;
		Scanner sc = new Scanner(file); 
		  
	    while (sc.hasNext()) { 
		      s = sc.next(); 
	    }
		 
		decode = Decode.decodeString(s);
		File newFile = new File("c:\\Users\\Administrator\\Desktop\\decode5100.txt");
		FileOutputStream fos = new FileOutputStream(newFile);
		fos.write(decode.getBytes());
		fos.close();
		

	}
	

}
