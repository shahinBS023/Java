import java.util.ArrayList;
import java.util.Scanner;

public class ColorArraylist {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> colorList = new ArrayList<String>(); 
		
		String colorName;
		
		System.out.print("How many color you want to add?: ");
		int i=1,x = input.nextInt();
		
		for(i=0; i<=x; i++) {
			if(i==0) {
				colorName = input.nextLine();
			}
			else {
				System.out.print("Enter color name (" + i + "): ");
				colorName = input.nextLine();
				colorList.add(colorName);
			}
				
		}// for loop end
		
		for(String temp :colorList) {
			System.out.println(temp);
		}
		
		
	}

}
