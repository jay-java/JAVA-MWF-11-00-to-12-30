package core;

import java.util.Scanner;

public class P009_MultiArray {
	public static void main(String[] args) {
		int i[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<=2;r++) {
			for(int c=0;c<=2;c++) {
				System.out.print(i[r][c]+" " );
			}
			System.out.println();
		}
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter num of row : ");
		int row = sc.nextInt();
		System.out.println("enter num of column : ");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		for(int r=0;r<row;r++) {
			for(int c=0;c<col;c++) {
				System.out.print("enter num at arr["+r+"]["+c+"] : ");
				arr[r][c] = sc.nextInt();
			}
		}
	}
}
