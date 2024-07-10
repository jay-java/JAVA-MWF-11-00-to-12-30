package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P027_Map {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		map.put(1, "java");//entry
		map.put(2, "java");
		map.put(4, "value");
		map.put(12, "C++");
		map.put(5, "php");
		map.put(null, "value");
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
