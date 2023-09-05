package Pattern_Assignment;
import java.util.*;

public class Ques21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N = s.nextInt();
		int i = 1;
		int nst1 = 1;
		int nst2 = 1;
		int nsp = 2*N-3;
		while(i<=N) {
			int j=1;
			while(j<=nst1) {
				System.out.print("*"+" ");
				j++;
			}
			
			int k=1;
			while(k<=nsp) {
				System.out.print(" "+" ");
				k++;
			}
			
			int l=1;
			while(l<=nst2) {
				System.out.print("*"+" ");
				l++;
			}
			System.out.println();
			i++;
			if (i==N) {
				nst1 = N;
				nst2 = N-1;
				nsp = 0;
			}
			else {
				nsp -= 2;
				nst1++;
				nst2++;
			}
		}

	}

}
