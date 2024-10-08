package core;

abstract class RBI {
	abstract public void SA();

	abstract public void HL();

	public void call() {
		System.out.println("call");
	}

	public static void RepoRate() {
		System.out.println("repo rate : +-4%");
	}
}

class SBI extends RBI {

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("SA interest : 5%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL : 7%");
	}

}

class PNB extends RBI {

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("PNB SA : 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("PNB HL : 8%");
	}

}

class JAVA extends RBI {

	@Override
	public void SA() {
		// TODO Auto-generated method stub
		System.out.println("JAVA SA : 8%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL : 9%");
	}

}

public class P015_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.SA();
		s.HL();
		SBI.RepoRate();
		PNB p = new PNB();
		p.SA();
		p.HL();
		PNB.RepoRate();
		JAVA j = new JAVA();
		j.SA();
		j.HL();
		JAVA.RepoRate();
	}

}
