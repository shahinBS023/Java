import java.util.Scanner;

public class areaPentagon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("#################### Area of a Regular pentagon #######################");
		System.out.print("\n\nEnder the one arm size of the pentagon[in meter]: ");
		
		double a = input.nextFloat();
		
		double p = (a/2) / 0.726542528; // tan(36�) = 0.726542528
		double area =  ((a * p)/2) * 5;
		
		System.out.printf("The area of the pentagon is, %.2f m\n", area);
		//System.out.println(Math.tan(36));

		
		
		// https://www.wikihow.com/images/thumb/f/f2/Find-the-Area-of-a-Regular-Pentagon-Step-9.jpg/v4-460px-Find-the-Area-of-a-Regular-Pentagon-Step-9.jpg
		// uTube Tutorial link
		// https://youtu.be/C-KlF2Xe4Rg
	}

}
