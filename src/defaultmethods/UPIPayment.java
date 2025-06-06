package defaultmethods;

public class UPIPayment implements PaymentProcessor{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
        System.out.println(generateReceipt(amount));
    }


}
