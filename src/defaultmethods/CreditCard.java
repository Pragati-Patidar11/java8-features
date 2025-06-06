package defaultmethods;

public class CreditCard implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println(generateReceipt(amount));
    }
}

