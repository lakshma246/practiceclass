package lakshmareddy.encapsulationpractise.controlstmt;

public class leap {

    static void year(int y) {
        if (y % 100 == 0 && y % 400 == 0) {
            // here year /100=0 if the condition it is century year satisfy go to next.
            //y/400=0  condition is true print leap year.
            // if false it is not century year so go to next condition.
            System.out.println(y+"this is leap year");
        }
        else if (y%4==0){
            // y/4=0, if it's true  print leap year
            //y/4=0, if its false print normal year
            System.out.println(y+"this is leap year");
        }
        else{
            System.out.println(y+ "normal year");
        }
    }
    public static void main(String[] args) {
        year(2024);
        year(2022);
        year(2020);
        year(1990);
    }
}
