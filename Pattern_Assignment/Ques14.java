package Pattern_Assignment;
import java.util.*;

public class Ques14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 1;
		System.out.print("Enter value of N: ");
		int N = s.nextInt();
		int nst = 1;
		int nsp = N-1;
		int n = 2*N-1;
		while(i<=n)
		{
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j++;
			}
			int k=1;
			while(k<=nst) {
				System.out.print("*"+" ");
				k++;
			}
			
			if(i<N) {
				nst++;
				nsp--;
			}
			else {
				nst--;
				nsp++;
			}	
			i++;
			System.out.println();
			
		}
	}

}
