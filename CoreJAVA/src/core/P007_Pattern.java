package core;

//*
//**
//***
//****
//*****
//1
//12
//123
//1234
//12345
//1
//10
//101
//1010
//10101
public class P007_Pattern {
	public static void main(String[] args) {
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				if (c % 2 == 0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}
