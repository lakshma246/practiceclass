package lakshmareddy.encapsulationpractise.day3.arthematic;

public class logical {
    public static void main(String[] args) {
        long x=100; long y=90; long z=80;
        System.out.println("logical opretors && Statments ");
        System.out.println(x>y && x>z);// true & true = true
        System.out.println(x<y && x<z);// false & false = false
        System.out.println(x>y && x<z);// true & false = false
        System.out.println(x<y && x>z);// false & true =false

        System.out.println("logical opretors || Statments ");
        System.out.println(x>y || x>z);// true or true = true
        System.out.println(x<y || x<z);// false or false = false
        System.out.println(x>y || x<z);// true or false = true
        System.out.println(x<y || x>z);// false or true =true

    }
}
