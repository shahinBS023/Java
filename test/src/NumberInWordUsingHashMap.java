import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberInWordUsingHashMap {

    static String reverseWords(String str)
    {

        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");

        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        // is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";

        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }

    public static void main(String[] args){
        HashMap<String,String> myHash = new HashMap<String,String>();
        Scanner input = new Scanner(System.in);
        String userInput, word="";
        myHash.put("1" , "One"); myHash.put("2" , "Two"); myHash.put("3" , "Three"); myHash.put("4" , "Four"); myHash.put("5" , "Five"); myHash.put("6" , "Six");
        myHash.put("7" , "Seven"); myHash.put("8" , "Eight"); myHash.put("9" , "Nine"); myHash.put("10" , "Ten"); myHash.put("11" , "Eleven"); myHash.put("12" , "Twelve");
        myHash.put("13" , "Thirteen"); myHash.put("14" , "Fourteen"); myHash.put("15" , "Fifteen"); myHash.put("16", "Sixteen"); myHash.put("17" , "Seventeen");
        myHash.put("18" , "Eighteen"); myHash.put("19" , "Nineteen"); myHash.put("20" , "Twenty"); myHash.put("30" , "Thirty"); myHash.put("40" , "Forty");
        myHash.put("50" , "Fifty"); myHash.put("60" , "Sixty"); myHash.put("70" , "Seventy"); myHash.put("80" , "Eighty"); myHash.put("90" , "Ninety"); myHash.put("100" , "One_Hundred");


        System.out.print("Enter a number: ");
        userInput = input.nextLine();

        if (myHash.containsKey(userInput)){
            System.out.println(myHash.get(userInput));
        }
        else {
            String lastTwoNumber, a, b;
            int len = userInput.length();
            a = String.valueOf(userInput.charAt(len-2));
            b = String.valueOf(userInput.charAt(len-1));

            lastTwoNumber = a+b;

            if(myHash.containsKey(lastTwoNumber)){
                word = word + myHash.get(lastTwoNumber) + " ";
            }


        }

        word = reverseWords(word);
        System.out.println(word);

    }
}
