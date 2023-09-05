package Pattern_Assignment;
import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = s.nextInt();
		int i=1;
		int nsp = n-2;
		while(i<=n) {
			if (i==1 || i==n) {
				int k=1;
				while(k<=n) {
					System.out.print("*" + " ");
					k++;
				}
			}
			else {
				System.out.print("*" + " ");
				int j=1;
				while(j<=nsp) {
					System.out.print(" " + " ");
					j++;
				}
				System.out.print("*" + " ");
			}
			System.out.println();
			i++;
		}
	}
}
