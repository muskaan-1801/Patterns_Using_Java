package Pattern_Assignment;

import java.util.Scanner;

public class Ques31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N = s.nextInt();
		int row = 1;
		while(row<=N) {
			int num=N;
			int col=1;
			while(col<=N) {
				if(row==N-col+1) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(num+" ");
				}
				col++;
				num--;
			}
			System.out.println();
			row++;

		}

	}

}
