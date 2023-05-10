package Stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStream {

    public static void main(String[] args) {
        IntStream.range(1,50).forEach(System.out::println);
        System.out.println();
        IntStream.rangeClosed(1,50).forEach(System.out::println);

        IntStream.rangeClosed(1,50).asDoubleStream().forEach(System.out::println);

        OptionalInt minnum =  IntStream.rangeClosed(1,50).min();
        System.out.println( "Optional min is " +minnum.getAsInt());
        OptionalInt maxValue =  IntStream.rangeClosed(1,50).max();
        System.out.println( "Optional max is " +maxValue.getAsInt());
        int sumValue =  IntStream.rangeClosed(1,50).sum();
        System.out.println( "sumValue  is " +sumValue);
        OptionalDouble avgValue =  IntStream.rangeClosed(1,50).average();
        System.out.println( "avgValue  is " +avgValue.getAsDouble());

    }


}
