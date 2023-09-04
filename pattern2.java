package pattern;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int N = s.nextInt();
		int i=1;
		
//		Method 1
		while(i<=N) {
			int j=N;
			while(j>=i) {
				System.out.print("*" + " ");
				j--;
			}
			System.out.println();
			i++;
		}
		
//		Method 2
		i=1;
		System.out.println();
		while(i<=N) {
			int j=1;
			while(j<=N-i+1) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
		}
		
//		Method 3
		i=1;
		int nst=N;
		System.out.println();
		while(i<=N) {
			int j=1;
			while(j<=nst) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
			nst--;
		}

	}

}
