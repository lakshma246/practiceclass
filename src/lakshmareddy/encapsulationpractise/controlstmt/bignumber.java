package lakshmareddy.encapsulationpractise.controlstmt;

public class bignumber {
        static void  bigest( int n, int n2, int n3){
            if (n>n2 && n>n3) {
                System.out.println("big number is " + n);
            }
            else if(n<n2 && n2>n3) {
                System.out.println("big number is " +n2);
            }
            else{
                System.out.println("big number is" + n3);
            }
        }
    public static void main(String[] args) {
        bigest(35,70,90);
        bigest(1053,500,1000);
        bigest(65,86,53);

    }
}
