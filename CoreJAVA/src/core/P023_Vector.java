package core;

import java.util.Enumeration;
import java.util.Vector;

public class P023_Vector {
	public static void main(String[] args) {
		Vector vr = new Vector();
		vr.add(1);
		vr.add('f');
		vr.add("java");
		vr.add(false);
		vr.add(3.14);
		vr.add(346456);
		vr.add(1);
		System.out.println(vr);
		vr.remove(1);
		System.out.println(vr);
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
