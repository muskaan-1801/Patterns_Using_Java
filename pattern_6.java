package pattern;
import java.util.*;

public class pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = s.nextInt();
		int row = 1;
		int nst = n;
		int nsp = 0;
		while(row<=n) {
			//work
			int i=1;
			while(i<=nsp)
			{
				System.out.print(" "+" ");
				i++;
			}

			int j=1;
			while(j<=nst) {
				System.out.print("*"+" ");
				j++;
			}

			//preparation for next row
			nsp++;
			nst--;
			row++;
			System.out.println();
		}

	}

}
