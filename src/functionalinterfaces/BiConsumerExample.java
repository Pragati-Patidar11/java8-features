package functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void printDetails(String name, int age) {
        BiConsumer<String, Integer> display = (n, a) -> System.out.println(n + " is " + a + " years old.");
        display.accept(name, age);
    }
}


