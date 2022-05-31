package lakshmareddy.encapsulationpractise;

public class sumeven {
    int x; int y; int x3; int x1;
    int x2;
     int even() {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            {
                if (i % 2 == 0)
                    sum = sum + i;
            }
        }
        System.out.println( "sum of even is"+ sum);

         return sum;
     }
     int odd() {
        int  oddsum = 0;
        for (int i = 1; i <= y; i++) {
            {
                if (i % 2 != 0)
                    oddsum = oddsum + i;
            }

        }
        System.out.println("sum of odd is"+oddsum);

         return oddsum;
     }
}
