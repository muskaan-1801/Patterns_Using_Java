package Pattern_Assignment;

import java.util.Scanner;

public class Ques27_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n = s.nextInt();
		int nsp = n-1;
		int i=1;
		int num = 1;
		int n_num1 = 1;
		int n_num2 = 0;
		while(i<=n) {
			int j = 1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j++;
			}
			
			int k=1;
			while(k<=n_num1) {
				System.out.print(num+" ");
				k++;
				num++;
			}
			num -= 2;
			int l = 1;
			while(l<=n_num2) {
				System.out.print(num+" ");
				l++;
				num--;
			}
			System.out.println();
			i++;
			nsp--;
			n_num1++;
			n_num2++;
			num = 1;
		}

	}

}
