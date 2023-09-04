package pattern;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=1;
		System.out.print("Enter the Value of Number of Rows: ");
		int R= s.nextInt();
		System.out.print("Enter the Value of Number of Columns: ");
		int C= s.nextInt();
		while(i<=R) {
			int j=1;
			while(j<=C) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
