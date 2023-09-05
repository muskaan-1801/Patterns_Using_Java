package Pattern_Assignment;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = s.nextInt();
		int i=1;
		int nst = n;
		int nsp = 0;
		while(i<=n) {
			int k=1;
			while(k<=nsp)
			{
				System.out.print(" "+" ");
				k++;
			}
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
			i++;
			nst--;
			nsp++;
		}

	}

}
