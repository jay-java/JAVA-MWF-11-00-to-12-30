package core;

class A1 {
	A1() {
		System.out.println("parent cons");
	}

	public void call() {
		System.out.println("call in A class");
	}
}

class B extends A1 {
	public void run() {
		System.out.println("run in B class");
	}
}

class C extends B {
	public void show() {
		System.out.println("Show in C class");
	}
}

class D extends A1 {
	public void aa() {
		System.out.println("aa in D class");
	}
}

public class P013_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.call();
		b.run();
		C c = new C();
		c.call();
		c.run();
		c.show();

	}
}
