package lakshmareddy.encapsulationpractise.basic;

public class sumevenodd {
    static void even(int x) {
             int sum = 0;
             int odd=0;
        for (int i = 1; i <= x; i++) {
            {
                if (i % 2 == 0)
                    sum = sum + i;
            }
        }
        System.out.println("sum of even number is " +sum);

    }
    static void odd(int y) {
        int  oddsum = 0;
        for (int i = 1; i <= y; i++) {
            {
                if (i % 2 != 0)
                    oddsum = oddsum + i;
            }

        }
        System.out.println("sum of odd number is " +oddsum);

    }

    public static void main(String[] args) {
        even(100);
        odd(100);


    }

}
