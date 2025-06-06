package functionalinterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void generateId() {
        Supplier<String> idSupplier = () -> "USER-" + System.currentTimeMillis();
        System.out.println("Generated ID: " + idSupplier.get());
    }
}

