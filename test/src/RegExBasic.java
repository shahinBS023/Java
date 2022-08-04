import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExBasic {
    public static void main(String[] args) {
        //-------------1st way--------------
        Pattern p = Pattern.compile(".o");
        Matcher m = p.matcher("To");
        boolean b = m.matches();
        System.out.println(b);

        Pattern p1 = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher("Hello World");
        boolean b1 = m1.find();
        System.out.println(b1);

        //------------2nd way--------------
        boolean b3 = Pattern.compile(".o").matcher("To").matches();
        System.out.println(b3);

        boolean b4 = Pattern.compile("HelLo", Pattern.CASE_INSENSITIVE).matcher("Hello World").find();
        System.out.println(b4);

        //---------------3rd way--------------
        boolean b5 = Pattern.matches("....o", "Toy o");
        System.out.println(b5);
        boolean b6 = Pattern.compile("hello", Pattern.CASE_INSENSITIVE).matcher("Hello World").find();
        System.out.println(b6);
    }
}
