package lakshmareddy.encapsulationpractise.day3.arthematic;

public class arhematicopretors {
    public static void main(String[] args) {
        int x=12; int y=36; byte z=124; float a=137.5f; double b=50.55; long l=100;

        int add=x+z;
        long sub =l-x;
        double mul= a*b;// a and b is decimal numbers  so the results will be decimal .
        int div=z/y;
        int rem=z%y;

        System.out.println("addition is :" +add);  //x+z=12+124=136
        System.out.println("subtraction is :" +sub);// l-x=100-12=88.
        System.out.println("multiplication is :" +mul);// a*b=137.5*50.55=6950.625
        System.out.println("division is : " +div);// quotient =z/y=124/36=3.
        System.out.println("remider is  :" +rem);// reminder z%y=124/36=16




    }
}
