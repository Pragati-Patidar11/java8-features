package functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void printMessage(String msg) {
        Consumer<String> printer = m -> System.out.println("Printing: " + m);
        printer.accept(msg);
    }
}

