package core;
class Data{
	int a;
	String name;
	long contact;
	Data(){
		System.out.println("default cons");
	}
	Data(int a){
		this.a = a;
		System.out.println(a);
	}
	Data(int a,String name,long contact){
		System.out.println("cons : a = : "+a+" name : "+name+" contact : "+contact);
		this.a= a ;
		this.name=name;
		this.contact=contact;
		
	}
	public void call() {
		System.out.println("call method : a : "+a+" name: "+name+" contact : "+contact);
	}
	
}
public class P012_Constructor {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.call();
		Data d2 = new Data(12);
		d2.call();
		Data d3 = new Data(1, "java", 9876542);
		d3.call();
	}
}
