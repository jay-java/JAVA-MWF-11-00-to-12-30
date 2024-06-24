package core;

public class P010_String {
	public static void main(String[] args) {
		String s = "java technology";
		String s1 = "tech";
		System.out.println(s.concat(s1));
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.contains("aaa"));
		System.out.println(s.startsWith(""));
		String s2 = "java";
		String s3 = "JAVA";
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareToIgnoreCase(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		String s4 = "     ";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
		String s5 = "			jav a				";
		System.out.println(s5);
		System.out.println(s5.trim());
//		StringBuffer s1 = new StringBuffer("java");
//		s1.append(" tech");
//		System.out.println(s1);
		
	}
}
