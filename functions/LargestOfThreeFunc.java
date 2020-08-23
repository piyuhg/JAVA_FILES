
import java.util.Scanner;

public class LargestOfThreeFunc {
	
	public static int largestOfThree(int a,int b,int c) {
		if(a>=b && a>=c)
			return a;
		else if(b>=a && b>=c)
			return b;
		else
			return c;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(largestOfThree(a,b,c));
	}
}
