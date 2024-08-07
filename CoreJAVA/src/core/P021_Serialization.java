package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employe implements Serializable{
	private int id;
 	private String name;
	private long contact;
	private String address;
	Employe(int id,String name,long contact,String address){
		this.id  = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}
	@Override
	public String toString() {
		return "id : "+id+ " name : "+name+" contact : "+contact+" address : "+address;
	}
}
public class P021_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Employe e1 = new Employe(1, "tushar", 987654, "ahmedabad");
//		FileOutputStream fos = new FileOutputStream("employee.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(e1);
//		oos.flush();
//		oos.close();
//		System.out.println("object written successfully");
		
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employe e = (Employe)ois.readObject();
		System.out.println(e);
	}
}
