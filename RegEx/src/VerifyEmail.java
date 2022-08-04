import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String emailPattern = "^[a-zA-Z0-9_.]{1,}@{1}[a-zA-Z]{1,}.[a-zA-Z.]{1,}$";
        System.out.print("Enter your mail: ");
        String userEmail = input.nextLine();
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher m = pattern.matcher(userEmail);
        boolean b = m.matches();

        if (b){
            System.out.println("You enter a valid email");
        }else {
            System.out.println("You entered a invalid email");
        }

    }
}
