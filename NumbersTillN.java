
import java.util.Scanner;

public class NumbersTillN {
	
	public static void printNums(int n) {
		if(n<=0) {
		System.out.println("Invalid Input");
			return;
		}
		for(int i =1;i<=n;i++)
			System.out.print(" "+i);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
;
		int n = s.nextInt();
		printNums(n);
		
		
		
	}

}
