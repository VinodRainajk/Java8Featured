package Consumer;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<String> consumer = (S)->  System.out.println(S.toUpperCase());
        consumer.accept("Vinod");
    }
}
