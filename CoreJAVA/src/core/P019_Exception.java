package core;

import java.util.InputMismatchException;
import java.util.Scanner;
class Divide{ //A
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a / b;
		}
		else {
			throw new ArithmeticException();
		}
//		System.out.println("c = " + c);
	}
}
public class P019_Exception { //B
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("denominator greater than 0");
		}catch(InputMismatchException e) {
			System.out.println("denominaor should be numeirc");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println("c = " + c);
//			System.exit(12);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("denominator greater than zero");
//		} catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will executes everytime");
//		}
	}
}
