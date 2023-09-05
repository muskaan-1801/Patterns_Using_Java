package Pattern_Assignment;
import java.util.*;

public class Ques19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n = s.nextInt();
		int nst1 = n/2+1;
		int nst2 = n/2;
		int nsp = 0;
		int i = 1;
		while(i<=n) {
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
			if(i==1) {
				nsp = 1;
				nst1--;
			}
			else if(i<=n/2) {
				nsp += 2;
				nst1--;
				nst2--;
			}
			else if(i==n-1) {
				nsp =0;
				nst1 = n/2+1;
				nst2 = n/2;
			}
			else {
				nst1++;
				nst2++;
				nsp -=2;
			}
			i++;
		}
	}

}
