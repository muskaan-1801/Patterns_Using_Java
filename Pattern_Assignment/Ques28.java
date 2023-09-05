package Pattern_Assignment;
import java.util.*;

public class Ques28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int n = s.nextInt();
		int nsp = n-1;
		int num_mid = 1;
		int n_num = 1; //quantiy of no
		int i=1;
		int num1 = 2;
		int num2 = 2;
		while(i<=n) {
			int j = 1;
			while(j<=nsp) {
				System.out.print(" "+" ");
				j++;
			}
			
			int k=1;
			while(k<=n_num) {
				int mid = (n_num+1)/2;
				if (k<mid)
				{
					System.out.print(num1 + " ");
					num2 = num1;
					num1++;
				}
				else if (k==mid) {
					System.out.print(num_mid+" ");
					num_mid += 2;
				}
				else {
					System.out.print(num2 + " ");
					num2--;
				
				}
				k++;
			}
			System.out.println();
			i++;
			nsp--;
			n_num += 2;
			num1 = i;
		}
	}

}
