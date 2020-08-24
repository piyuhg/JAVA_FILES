
import java.util.Scanner;

public class PowerOfNumberFunc {

	public static int powerOfNumber(int x,int n) {
		int num = 1;
		for(int i = 1;i<=n;i++)
			num = num*x;
		return num;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int n = s.nextInt();
		System.out.println(powerOfNumber(x,n));
	}

}
