
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int rem = num%2;
		if (rem==0)
		{
			System.out.println("Even");
			return;
		}
			System.out.println("Odd");

	}

}
