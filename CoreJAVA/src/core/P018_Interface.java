package core;

interface inter1 {
	public void interface1();

	public static void interfaceee1() {
		System.out.println("interfacee 1");
	}
}

interface inter2 extends inter1 {
	public void interface2();

	public static void interfaceee2() {
		System.out.println("interfacee 2");
	}
}

interface inter3 {
	public void interface3();

	public static void interfaceee3() {
		System.out.println("interfacee 3");
	}
}

class IntefaceCall implements inter2, inter3 {

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}

}

public class P018_Interface {
	public static void main(String[] args) {
		IntefaceCall i = new IntefaceCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.interfaceee1();
		inter2.interfaceee2();
		inter3.interfaceee3();

	}
}
