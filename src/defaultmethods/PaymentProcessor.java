package defaultmethods;

public interface PaymentProcessor {

    void processPayment(double amount);

    default String generateReceipt(double amount) {
        return "Receipt: Payment of $" + amount + " has been processed.";
    }
}

