package pattern;
import java.util.*;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i=1;
		System.out.print("Enter the value of N: ");
		int N= s.nextInt();
		while(i<=N) {
			int j=1;
			while(j<=N) {
				System.out.print("*" + " ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
