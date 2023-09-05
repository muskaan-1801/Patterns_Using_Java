package Pattern_Assignment;
import java.util.*;

public class Ques17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n = s.nextInt();
		int nst = n/2;
		int nsp = 1;
		int i = 1;
		while(i<=n) {
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}
			
			int k=1;
			while(k<=nsp) {
				System.out.print(" "+" ");
				k++;
			}
			
			int l=1;
			while(l<=nst) {
				System.out.print("*"+" ");
				l++;
			}
			
			System.out.println();
			if(i <= n/2) {
				nsp+=2;
				nst--;
			
			}
			else {
				nsp-=2;
				nst++;
			}
			i++;
		}
	}
}

