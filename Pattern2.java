package patterns;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i = 1;
		int val = 1;
		while(i<=n)
		{
			int j = 1;
			while(j<=i) {
				System.out.print(val);
				j++;
				val++;
			}
			i++;
			System.out.println();
		}


	}

}
