package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void checkEmail(String email) {
        Predicate<String> isValidEmail = e -> e != null && e.contains("@") && e.endsWith(".com");

        System.out.println("Is email valid? " + isValidEmail.test(email));
    }
}

