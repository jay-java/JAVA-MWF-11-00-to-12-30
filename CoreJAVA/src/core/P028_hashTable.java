package core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class P028_hashTable {
	public static void main(String[] args) {
		Hashtable<Integer,String> map = new Hashtable<Integer, String>();
		map.put(1, "java");//entry
		map.put(2, "java");
		map.put(4, "value");
		map.put(12, "C++");
		map.put(5, "php");
		map.put(132, "value");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Entry)itr.next();
			System.out.print("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
	}
}
