package TrialsStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Trial {
    public static void main(String[] args) {
        int [] values = {3,10,6,1,4,8,2,5,9,7};
        System.out.println("Original");
        IntStream.of(values).forEach(a-> System.out.printf(" %d", a));
        System.out.println();
        System.out.printf("count: %d", IntStream.of(values).count());
        System.out.println();
        System.out.printf("Min: %d", IntStream.of(values).min().getAsInt());
        System.out.println();
        System.out.printf("Max: %d", IntStream.of(values).max().getAsInt());
        System.out.println();
        System.out.printf("Sum: %d", IntStream.of(values).sum());
        System.out.println();
        System.out.printf("Average: %.2f", IntStream.of(values).average().getAsDouble());
        System.out.println();
        int sum = IntStream.of(values).reduce(0,(x,y)->x+y);
        System.out.printf("sum with reduce: %d", sum);
        System.out.println();
        int SumSquare = IntStream.of(values).reduce(0,(x,y)->x+y*y);
        System.out.printf("SumSquare: %d", SumSquare);
        System.out.println();
        int products = IntStream.of(values).reduce(1,(x,y)->x*y);
        System.out.printf("products: %,d", products);
        System.out.println();
        System.out.println("Sorted evens");
        IntStream.of(values).filter(a->a%2==0)
                .sorted()
                .forEach(System.out::println);
        System.out.println("-----------");
        System.out.println("sorted odds multiplied by 10");
        IntStream.of(values).filter(a->a%2!=0)
                .map(a->a*10)
                .sorted()
                .forEach(System.out::println);
        System.out.println("---------");

        int sums = IntStream.range(1,10).sum();
        System.out.println(sums);
        int sumss = IntStream.rangeClosed(1,10).sum();
        System.out.println(sumss);

    }
}
