import java.util.Scanner;

public class SimpleInterest {

	
	public static int simpleInterest(int p,int r,int t) {
		int si = p*r*t/100;
		int amount = p + si;
		System.out.println(si);
		return amount;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		int amount=simpleInterest(p,r,t);
		System.out.println(amount);		

	}

}
