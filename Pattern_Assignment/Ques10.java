package Pattern_Assignment;

import java.util.Scanner;

public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N = s.nextInt();
		int i = 1;
		int nsp = 0;
		int nst = 2*N-1;
		while(i<=N) {
			int j=1;
			while(j<=nsp) {
				System.out.print(" " + " ");
				j++;
			}
			
			int k=1;
			while(k<=nst)
			{
				System.out.print("*"+" ");
				k++;
			}
			System.out.println();
			i++;
			nsp++;
			nst -=2;
		}


	}

}
