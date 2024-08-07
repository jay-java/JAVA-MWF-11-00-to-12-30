package core;

//Poly-Many
//morphism - Forms
//method - having diff forms

//1.Overloading
class Laptop {
	public void dell() {
		System.out.println("dell laptop");
	}

	public void dell(int ram, String processor) {
		System.out.println("dell ram : " + ram + " processor : " + processor);
	}

	public void dell(int ram, String processor, String graphic) {
		System.out.println("ram : " + ram + " processor : " + processor + " graphinc: " + graphic);
	}
}

//2.Overriding
class Parent {
	public void data(int i, String name) {
		System.out.println("Parent : i = "+i+" name = "+name);
	}
}

class Child extends Parent{
	public void data(int i, String name) {
		super.data(12, "python");
		System.out.println("Child : i = "+i+" name = "+name);
	}
	public void calling() {
		System.out.println("calling in child class");
	}
}

public class P014_Polymorphism {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.dell();
		l1.dell(8, "i5 processor");
		l1.dell(12, "i7 processor", "Nvidea");
		
		Child c = new Child();
		c.data(1, "java");
		
	}
}
