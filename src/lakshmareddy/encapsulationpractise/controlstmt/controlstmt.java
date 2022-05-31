package lakshmareddy.encapsulationpractise.controlstmt;

public class controlstmt {

    public static void even (int a){
        if (a%2 != 0){
            System.out.println(a+ "= that is odd number ");
        }
        else{
            System.out.println(a+ "= This is even number ");
        }

    }

    public static void main(String[] args) {
        even(2);
        even(7);
        even(769);
        even(10458);
        even(76);


        //System.out.println(even);
    }


}


