package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Person{
	private int id;
	private String name;
	private long contact;
	private String address;
	public Person(int id,String name,long contact,String address) {
		this.id = id;
		this.name=name;
		this.contact = contact;
		this.address = address;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" contact : "+contact+" address : "+address;
	}
}
public class P024_ListPractical {
	public static void main(String[] args) {
		Person p1 = new Person(1, "tushar", 896764, "ahmedabad");
		Person p2 = new Person(2, "neelam", 896764, "mumbai");
		Person p3 = new Person(3, "sonaram", 896764, "delhi");
		Person p4 = new Person(4, "krishna", 896764, "kolkata");
		Person p5 = new Person(5, "vraj", 896764, "hydrabad");
		Person p6 = new Person(6, "ujjawal", 896764, "ahmedabad");
		
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		System.out.println(list);
		
		for(Person p:list) {
			System.out.println(p);
		}
		
//		Iterator itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
