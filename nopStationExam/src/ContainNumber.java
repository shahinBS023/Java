public class ContainNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int givenNumber = 3, found = 0;

        for (int n : num) {
            if (n == givenNumber) {
                found = 1;
                break;
            }
        }
        if(found == 1){
            System.out.println("The Array contains " + givenNumber);
        }
        else{
            System.out.println("The Array not contains " + givenNumber);
        }
    }
}

