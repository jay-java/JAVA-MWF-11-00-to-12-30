package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class P026_TreeSet {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(12);
		set.add(4565);
		set.add(-34545);
		set.add(1);
		set.add(0);
		set.add(145);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
