public class StringEmptyOrNull {

    public void stringChecker(String string, int i){
        if(string == null) {
            System.out.println("String" + i + " is null");
        }
        else if(string.isEmpty()) {
            System.out.println("String" + i + " is empty");
        }
        else if(string.isBlank()) {
            System.out.println("String" + i + " is blank");
        }
    }

    public static void main(String[] args) {
        String string1 = null, string2 = "", string3="  ";
        StringEmptyOrNull ob = new StringEmptyOrNull();
        ob.stringChecker(string1,1);
        ob.stringChecker(string2, 2);
        ob.stringChecker(string3,3);
    }
}
