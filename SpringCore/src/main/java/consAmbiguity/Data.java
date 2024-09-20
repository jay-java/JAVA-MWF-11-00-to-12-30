package consAmbiguity;

public class Data {
	private int a;
	private int b;

	public Data(int a, int b) {
		System.out.println("data set by int cons");
		this.a = a;
		this.b = b;
	}

	public Data(String a, String b) {
		System.out.println("data set by String cons");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}

	public Data(double a, double b) {
		System.out.println("data set by double cons");
		this.a = (int) a;
		this.b = (int) b;
	}

	@Override
	public String toString() {
		return "Data [a=" + a + ", b=" + b + "]";
	}

}
