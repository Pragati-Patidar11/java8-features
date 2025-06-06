package staticmethods;

import java.util.Set;
import java.util.regex.Pattern;

public interface UserValidator {

    static boolean isValidEmail(User user) {
        String email = user.getEmail();
        if (email == null || email.isEmpty()) {
            return false;
        }

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        return Pattern.matches(regex, email);
    }

    static boolean isTrustedDomain(User user) {
        String email = user.getEmail();
        if (email == null || !email.contains("@")) {
            return false;
        }
        String domain = email.substring(email.indexOf("@") + 1).toLowerCase();

        Set<String> trustedDomains = Set.of("gmail.com", "yahoo.com", "outlook.com");
        return trustedDomains.contains(domain);
    }

}
