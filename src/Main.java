import defaultmethods.PayPalPayment;
import defaultmethods.PaymentProcessor;
import defaultmethods.CreditCard;
import defaultmethods.UPIPayment;
import functionalinterfaces.FunctionalInterfaceExamples;
import methodreference.MethodReferenceExamples;
import staticmethods.User;
import staticmethods.UserValidator;

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


        PaymentProcessor payment = new CreditCard();
        payment.processPayment(150.0);


        PaymentProcessor upiPayment = new UPIPayment();
        upiPayment.processPayment(100.0);

        PaymentProcessor paypalPayment = new PayPalPayment();
        paypalPayment.processPayment(200.0);


        MethodReferenceExamples examples = new MethodReferenceExamples();

        examples.staticReference();
        examples.instanceReference();
        examples.arbitraryObjectReference();
        examples.constructorReference();


        FunctionalInterfaceExamples example = new FunctionalInterfaceExamples();
        example.runAllExamples();
    }
}







