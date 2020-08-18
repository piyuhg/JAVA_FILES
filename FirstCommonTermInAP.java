
public class FirstCommonTermInAP {
	
	//AP1 = b, b + a, b + 2*a, ...
	//AP2 = d, d + c, d + 2*c, ...

	public static int getFirstCommonTermInAP(int a, int b, int c, int d) {
		
		int diff = b-d;
		
		// First checking whether both APs intersect or not
		int gcd = 1;
		int smaller = Math.min(a,c);
		for(int i =2;i<=smaller;i++) {
			if(a%i==0 && c%i==0)
				gcd = i;
		}
		if(diff%gcd!=0) {		
			return -1;	//APs do not intersect	
		}

		// Finding 1st common term
		double i = 0;
		for(int j = 0; j< 500; j++) {
			i = (c*j - diff)/(a*1.0);
			if(i - Math.floor(i) == 0) {
				break;
			}
		}
		return (int)(b + a*i);
	}
	
	public static void main(String[] args) {
		
		int a, b, c, d;
				
		a=20; b=2; c=9; d=19;
		System.out.println();
		if(result == -1) 
			System.out.println("The AP1 and AP2 do not intersect each other");
		else
			System.out.println("The first common term in AP1 and AP2 is: "+result);

		System.out.println("\n-----------------------------\n");

		a=2; b=1; c=16; d=12;
		System.out.println();
		if(result == -1) 
			System.out.println("The AP1 and AP2 do not intersect each other");
		else
			System.out.println("The first common term in AP1 and AP2 is: "+result);
	}
}		
