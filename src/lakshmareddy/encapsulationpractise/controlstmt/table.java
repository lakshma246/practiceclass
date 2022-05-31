package lakshmareddy.encapsulationpractise.controlstmt;

public class table {
    static void tables(int n) {
        int maximum =20;// we are calculating max (nx20).
        for (int i = 1; i<=maximum; i++) {//
        if (i%n==0 || i%n!=0){
                System.out.println(n+" X "+i+"="+n*i);
            }

        }
    }

    public static void main(String[] args) {
        tables(9);
        System.out.println("==========");
        tables(12);
        tables(21);

    }
}

