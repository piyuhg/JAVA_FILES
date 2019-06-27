package for_lop;
import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		long a = 0;
		long b = 1;
		long c;
		for(int i=0;i<n;i++) {
			c =  a +b;
			a = b;
			b = c;
			
		}
		
		System.out.println(a);

	}

}
