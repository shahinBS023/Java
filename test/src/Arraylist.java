import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Coconut");
        myList.add("Orange");
        myList.add("jackfruit");
        myList.add("Mango");
        int a = myList.size();
        boolean x=myList.isEmpty();

        for (String s:myList){
            System.out.println(s);
        }



    }
}