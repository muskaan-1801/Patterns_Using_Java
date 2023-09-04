package pattern;
import java.util.*;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = s.nextInt();
		int i=1;
		int nst=1;
		while(i<=N) {
			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
			nst++;
			i++;
		}
	}
}
