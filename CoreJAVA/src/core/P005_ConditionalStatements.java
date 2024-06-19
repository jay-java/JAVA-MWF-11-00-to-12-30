package core;

import java.util.Scanner;

//1.simple if
//2.if else
//	3.nested if
//	4.else if ladder
//	5.switch case
public class P005_ConditionalStatements {
	public static void main(String[] args) {
		int i = 3, j = 2;
		if (i > j) {
			System.out.println("i is greater than j");
		}

		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("j is grater than i");
		}

		int age = 14;
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greatr than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks : ");
		int m = sc.nextInt();
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 50) {
			System.out.println("pass class");
		} else if (m >= 51 && m <= 70) {
			System.out.println("C class");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B class");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A class");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ class");
		} else {
			System.out.println("invalid input");
		}

		System.out.println("1.English\n2.Hindi\n3.Gujarati");
		System.out.println("enter your choice : ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
