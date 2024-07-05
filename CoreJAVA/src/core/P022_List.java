package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//<generics>
public class P022_List {
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		List list = new ArrayList();
		list.add(1);
		list.add('d');
		list.add(false);
		list.add("java");
		list.add(3.14);
		list.add(23556767);
		list.add("name");
		list.add(1);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("list in reverse order");
		ListIterator litr = list.listIterator();
		System.out.println("list Iterator : "+litr);
//		System.out.println(litr.hasPrevious());
//		while(litr.hasPrevious()) {
//			System.out.println(litr.previous());
//		}
	}
}
