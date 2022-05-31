package lakshmareddy.encapsulationpractise.controlstmt;

public class primeno {
    static void primenumber(int n) {
        if (n % 2 ==1 && n%3!=0) {
            System.out.println("it is  prime number" + n);
        } else if ( n%2==0 && n%3!=0) {
            System.out.println("it even number" + n);
        } else {
            System.out.println("it is base  number " + n);

    }
    }
    public static void main(String[] args) {
        primenumber(9996917);
        primenumber(17);
        primenumber(16);
        primenumber(9);
        primenumber(41);
    }
}