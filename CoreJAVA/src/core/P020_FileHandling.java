package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//FileOUtputStream->to write data into file
//FileINputStream->to read data from file
//FileWriter-> to write
//FileReader-> to read
public class P020_FileHandling {
	public static void main(String[] args) throws IOException {
//		String msg = "java is very powerful language for web development";
//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		byte[] b = msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("data written successfully");
		
//		FileInputStream fis = new FileInputStream("t1.txt");
//		int i;
//		while((i = fis.read())!=-1) {
//			System.out.print((char)i);
//		}
		
//		FileWriter fr = new FileWriter("t2.txt");
//		String msg = "java is very powerful language for web development";
//		fr.write(msg);
//		fr.flush();
//		fr.close();
//		System.out.println("success");
		
		FileReader fr = new FileReader("t2.txt");
		int i;
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
	}
}