package core;

import java.util.Scanner;

class A{
	int i;
	public void call() {
			System.out.println("call function in A class");	
	}
}
public class P003_UserInput {
	public static void main(String[] args) {
		System.out.println("main class");
		A obj = new A();
		obj.call();
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter i = ");
		int i = sc.nextInt();
		System.out.println("enter j = ");
		int j = sc.nextInt();
		int k = i+j;
		System.out.println("addition of i and j = "+(i+j));
		
		
	}
}
