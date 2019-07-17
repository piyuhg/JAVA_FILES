
package break_continue;
import java.util.Scanner;
public class DecimalToBaseN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value in Decimal: ");
		int dec = s.nextInt();
		int rem = 0;
		int i = 1;
		int x = 0; // new number
		System.out.print("Enter the new base system: ");
		int n = s.nextInt(); // new base
		while(n>36||n<=1) {
			System.out.println("Enter valid value of n (2-36): ");
			n = s.nextInt();
		}
		String str = "";
		int num = dec;
		if(n>11) {
			char c;
			while(num!=0) {
				rem=num%n;
				if(rem>9)
					c = (char)(rem+55);
				else
					c = (char)(rem+48);
				num = num/n;
				str = c + str;
			}
			System.out.println("The value of "+dec+" in "+n+" base is: "+str);
		}else {
			while(num!=0) {
				rem = num % n;
				num = num / n;
				x = x + rem*i;
				i = i*10;
			}
			System.out.println("The value of "+dec+" in "+n+" base is: "+x);
		}
		

	}

}
