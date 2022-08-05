
import java.util.Scanner;

public class SumProductMinMax3 extends Method{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int first, secound, third;
		System.out.print("Enter the first number: ");
		first = input.nextInt();
		
		System.out.print("Enter the secound number: ");
		secound = input.nextInt();
		
		System.out.print("Enter the third number: ");
		third = input.nextInt();
		
		System.out.println("The sum is: " + threeSum(first, secound, third));
		System.out.println("The product  is: " + threeProduct(first, secound, third));
		checkSmaller(first, secound, third);
		checkLarger(first, secound, third);

	}

}
