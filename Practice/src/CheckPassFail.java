import java.util.Scanner;

public class CheckPassFail extends Method{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ender you marks: ");
		int num = input.nextInt();
		
		int result = checkMark(num);
		
		if(result == 1)
			System.out.println("PASS");
		else if(result == 0)
			System.out.println("FAIL");
		
		System.out.println("DONE");
		
	}
}
