import java.util.Scanner;

public class findTheSmallestNumber extends Method {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int first, secound, third;
		System.out.print("Enter the first number: ");
		first = input.nextInt();
		
		System.out.print("Enter the secound number: ");
		secound = input.nextInt();
		
		System.out.print("Enter the third number: ");
		third = input.nextInt();
		
		checkSmaller(first, secound, third);

	}

}
