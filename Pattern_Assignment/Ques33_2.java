package Pattern_Assignment;

import java.util.Scanner;

public class Ques33_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n = s.nextInt();
		int nsp = n-1;
		int i=1;
		int n_num = 0;
		while(i<=n) {
			int j = 1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j++;
			}
			
			//value print
			int k = 1;
			int val = i;
			while(k<=n_num) {
				System.out.print(val + " ");
				if (k< (n_num)/2 + 1) {
					val++;
				}
				else {
					val--;
				}
				
				k++;
			}
			System.out.println();
			i++;
			n_num += 2;
			nsp--;
		}

	}

}
