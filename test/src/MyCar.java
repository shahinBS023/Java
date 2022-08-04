public class MyCar {
    //
    static void predictRace(boolean state){
        if(state == true){
            System.out.println("You should win the race");
        }else{
            System.out.println("Vaiya, jore chalan.");
        }
    }

    public void speed(double spd){
        boolean truefalse;
        if(spd > 150){
            truefalse = true;
        }else{
            truefalse = false;
        }

        predictRace(truefalse);
    }



    public static void main(String[] args){
        MyCar todayRace = new MyCar();
        todayRace.speed(69);

    }
}
