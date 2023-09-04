package pattern;
import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N = s.nextInt();
		int i = 1;
		while(i<=N) {
			int k=N;
			int j=i;
			while(k>i) {
				System.out.print(" ");
				k--;
			}
			while(j>0)
			{
				System.out.print("* ");
				j--;
				
			}
			System.out.println();
			i++;
		}
	}

}
