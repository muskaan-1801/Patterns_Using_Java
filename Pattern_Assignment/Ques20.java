package Pattern_Assignment;
import java.util.*;

public class Ques20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int N = s.nextInt();
		int i = 1;
		int nst1 = 1;
		int nst2 = 0;
		int nsp1 = N/2;
		int nsp2 = 0;
		while(i<=N) {
			int j=1;
			while(j<=nsp1) {
				System.out.print(" "+" ");
				j++;
			}
			
			int k = 1;
			while(k<=nst1) {
				System.out.print("*"+" ");
				k++;
			}
			
			int l=1;
			while(l<=nsp2) {
				System.out.print(" "+" ");
				l++;
			}
			
			int m = 1;
			while(m<=nst2) {
				System.out.print("*"+" ");
				m++;
			}
			
			System.out.println();
			if (i<= (N/2)) {
				nsp1--;
				if (i==1) {
					nsp2 = 1; 
				}
				else {
					nsp2 +=2;
				}
				nst2 = 1;				
			}
			else {
				nsp1++;
				if(i==N-1) {
					nst2 = 0;
				}
				nsp2 -= 2;
			}
			i++;
			
			
		}
	}

}
