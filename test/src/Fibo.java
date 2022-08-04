public class Fibo {
    public static void main(String[] args){
        int x=0, y=1, temp, i=0;

        while(i<10){
            temp = x+y;
            System.out.print(y + " ");
            x= y;
            y=temp;
            i++;
        }
    }
}
