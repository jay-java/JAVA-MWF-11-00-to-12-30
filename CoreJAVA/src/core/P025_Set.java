package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P025_Set {
	public static void main(String[] args) {
//		Set set = new HashSet();
		HashSet set = new HashSet();
		set.add(12);
		set.add("java");
		set.add(34545);
		set.add(true);
		set.add(3.14);
		set.add(12);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
