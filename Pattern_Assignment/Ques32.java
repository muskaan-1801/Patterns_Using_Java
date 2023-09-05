package Pattern_Assignment;
import java.util.*;

public class Ques32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter value of N: ");
		int N = s.nextInt();
		int i = 1;
		int num = 1;
		int n_num = 1;
		while(i<=N) {
			int j = 1;
			while(j<=n_num) {
				if (j%2==0) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(num+" ");
				}
				j++;
			}
			System.out.println();
			i++;
			n_num += 2;
			num++;
		}
		n_num = 2*(N-1)-1;
		i = 1;
		num = N-1;
		while(i<=N) {
			int j = 1;
			while(j<=n_num) {
				if (j%2==0) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(num+" ");
				}
				j++;
			}
			System.out.println();
			i++;
			n_num -=2;
			num--;
		}
		

	}

}
