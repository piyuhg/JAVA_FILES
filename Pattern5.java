package patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j = 1;
			int k = i;
			int sp = 1;
			while(sp<=n-i) {
				System.out.print(" ");
				sp++;
			}		
			while(j<=i)
			{
				System.out.print(k);
				k++;
				j++;
			}
			System.out.println();
			i++;			
		}

	}

}
