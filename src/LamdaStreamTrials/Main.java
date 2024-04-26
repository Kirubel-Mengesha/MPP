package LamdaStreamTrials;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        //
        System.out.println("even filter");
        Arrays.stream(arr).filter(a->a%2==0)
                .forEach(System.out::println); // same as forEach(a-> sout(a));
        System.out.println();
        System.out.println("odd filter");
        Arrays.stream(arr).filter(a->a%2!=0)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("minimum");
        System.out.printf("min : %d", Arrays.stream(arr).min().getAsInt() );
        System.out.println();
        System.out.println("maximum");
        System.out.printf("max: %d", Arrays.stream(arr).max().getAsInt());
        System.out.println();

        System.out.printf("average: %.2f", Arrays.stream(arr).average().getAsDouble());
        System.out.println();
        System.out.printf("Count: %d", Arrays.stream(arr).count());
        System.out.println();
        System.out.printf("Sum: %d", Arrays.stream(arr).sum());
        System.out.println();


        System.out.printf("sum with reduce: %d", Arrays.stream(arr).reduce(0,(x,y)->x+y));  // Integer::sum
        System.out.println();
        System.out.printf("sum of squares: %d", Arrays.stream(arr).reduce(0,(x,y)->x+y*y));
        System.out.println();
        System.out.printf("product of values with reduce: %d", Arrays.stream(arr).reduce(1,(x,y)->x*y));
        System.out.println();
        System.out.println("evens in sorted order: ");
        Arrays.stream(arr).filter(x->x%2==0)
                .sorted()
                .forEach(System.out::println); // x-> sout(x)
        System.out.println();







    }
}
