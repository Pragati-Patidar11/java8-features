package functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    public static void convertToUpper(String input) {
        Function<String, String> toUpper = s -> s.toUpperCase();
        System.out.println("Uppercase: " + toUpper.apply(input));
    }
}

