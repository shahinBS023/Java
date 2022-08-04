import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyPhoneNumberBD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your BD phone number: ");
        String userInput = input.nextLine();
        Pattern pattern = Pattern.compile("((\\+88)?-?01[0-9]{9})");
        Matcher m = pattern.matcher(userInput);
        boolean b = m.matches();

        if (b){
            System.out.println("You enter a valid phone number");
        }else {
            System.out.println("You entered a invalid phone number");
        }
    }
}
