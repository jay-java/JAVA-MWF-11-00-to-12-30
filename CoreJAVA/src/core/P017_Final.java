package core;
final class ABC{
	final int i = 12;
	final public void change() {
//		i++;
		System.out.println("chagne in parent i = "+i);
	}
}
class AA extends ABC{
	public void change() {
		System.out.println("change in child classs");
	}
}
public class P017_Final {
	public static void main(String[] args) {
		ABC a = new ABC();
		a.chagne();
	}
}
