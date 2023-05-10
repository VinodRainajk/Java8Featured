package Stream;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxing {


    static List<Integer> BoxingMethod()
    {
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());
    }

    static int unBoxingMethod(List<Integer>  inputlist)
    {
        return inputlist.stream()
                .mapToInt(Integer::intValue) // Converts Integer to int
                .sum();
    }
    public static void main(String[] args) {

        System.out.println( "Boxed Method "+BoxingMethod());
        List<Integer> boxedvalues = BoxingMethod();
        System.out.println( "Boxed Method "+unBoxingMethod(boxedvalues));

    }

}
