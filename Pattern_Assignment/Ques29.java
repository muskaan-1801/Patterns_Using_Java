package Pattern_Assignment;
import java.util.*;

public class Ques29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N = s.nextInt();
		int nsp = N-1;
		int n_num = 1;
		int num = 1;
		int i = 1;
		while(i<=N) {
			int j=1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j++;
			}
			int k=1;
			while(k<=n_num) {
				if (k==1 || k==n_num) {
					System.out.print(num+" ");
				}
				else {
					System.out.print(0+" ");
				}
				k++;
			}
			System.out.println();
			i++;
			nsp--;
			n_num += 2;
			num++;
			
		}
	}
}
