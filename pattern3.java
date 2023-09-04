package pattern;
import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = s.nextInt();
		int i=1;
		int k=N-1;
		int nst=1;
		while(i<=N) {
			int j=1;
			k=N;
			while(k>=i)
			{
				System.out.print(" ");
				k--;
			}
			while(j<=nst) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			nst++;
			i++;
		}
		

	}

}
