import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter your name \n");
		String str = scan.nextLine();
		
		System.out.println("Hello " + str);
		
		char c = str.charAt(0);
		
		System.out.println(c);

		int p = scan.nextInt();
		int r = scan.nextInt();
		int t = scan.nextInt();
		int si = (p*r*t);
		System.out.println(si);
		
	}

}
