public class Method {
	//for findTheSmallestNumber class//
	public static void checkSmaller(int f, int s, int t) {
		
		if((f < s) && (f < t)) {
			System.out.println("(First number) " + f + " is the samllest number");
		}
		
		else if((s < f) && (s < t)) {
			System.out.println("(Secound number) " + s + " is the samllest number");
		}
		
		else {
			System.out.println("(Third number) " + t + " is the samllest number");
		}
		
	}// end checkSmaller
	
	
	public static void checkLarger(int f, int s, int t) {
		
		if((f > s) && (f > t)) {
			System.out.println("(First number) " + f + " is the largest number");
		}
		
		else if((s > f) && (s > t)) {
			System.out.println("(Secound number) " + s + " is the largest number");
		}
		
		else {
			System.out.println("(Third number) " + t + " is the largest number");
		}
		
	}// end check Larger
	
	
	
	//for CheckPassFail class
	public static int checkMark(int x) {
		if(x>=50)
			return 1;
		else
			return 0;
	}// end checkMark
	
	//for sum
	public static int threeSum(int a, int b, int c) {
		return a+b+c;
	}// end three-sum
	
	//for product
	public static int threeProduct(int a, int b, int c) {
		return a*b*c;
	}// end product
	
	
	
}
