package Pattern_Assignment;
import java.util.*;

public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 1;
		System.out.print("Enter value of N: ");
		int N = s.nextInt();
		int nst = 1;
		int n = 2*N-1;
		while(i<=n)
		{
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}
			
			if(i<N) {
				nst++;
			}
			else {
				nst--;
			}	
			i++;
			System.out.println();
			
		}
	}
}
