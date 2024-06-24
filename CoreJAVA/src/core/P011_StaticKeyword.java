package core;
class Student{
	static {
		System.out.println("student stsatic block");
	}
	int id;
	String name;
	String address;
	static String College_name = "TOPS";
	public void call() {
		System.out.println("non static function");
	}
	public static void staticFunciton() {
		System.out.println("static function");
	}
}

public class P011_StaticKeyword {
	static {
		System.out.println("this will execute before main");
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=1;
		s1.name="abc";
		s1.address="ahmedabad";
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address);
		System.out.println(s1.College_name);
		s1.call();
		Student.staticFunciton();
	}
}
