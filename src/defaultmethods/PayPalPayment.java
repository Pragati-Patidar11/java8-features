package defaultmethods;

public class PayPalPayment implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println(generateReceipt(amount));
    }

    @Override
    public String generateReceipt(double amount) {
        return "PayPal Receipt: Your payment of $" + amount + " was successful!";
    }

}


