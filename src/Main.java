import entitiy.User;
import validation.UserValidator;

public class Main {
    public static void main(String[] args) {

        User user = new User("pragatipatidar34@gmail.com");

        if (UserValidator.isValidEmail(user)) {
            if (UserValidator.isTrustedDomain(user)) {
                System.out.println("Email is valid and trusted.");
            } else {
                System.out.println("Email is valid but not from a trusted domain.");
            }
        } else {
            System.out.println("Invalid email format.");
        }
    }


    }
