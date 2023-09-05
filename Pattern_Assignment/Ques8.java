package Pattern_Assignment;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = s.nextInt();
		int row = 1;
		while(row<=n) {
			int col = 1;
			while(col<=n) {
				if (row == col || row==n-col+1) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
