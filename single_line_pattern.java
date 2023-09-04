package pattern;
import java.util.*;

public class single_line_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the value of N: ");
		Scanner s = new Scanner(System.in);
		int i=0;
		int N = s.nextInt();
		while(i<N) {
			System.out.print("*"+" ");
			i++;
		}

	}

}
