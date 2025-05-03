// Abstract base class
abstract class Payment {
    protected double amount;
    public void setAmount(double amt) {
        amount = amt;
    }
    public void showSummary() {
        System.out.println("Amount to pay: Rs." + amount);
    }
    // Abstract method (must be implemented by subclasses)
    public abstract void processPayment();
}
// Credit Card Payment
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cvv;
    public void setCardDetails(String card, String cvvCode) {
        cardNumber = card;
        cvv = cvvCode;
    }
    @Override
    public void processPayment() {
        System.out.println("\nProcessing Credit Card Payment:");
        System.out.println("Card: " + cardNumber);
        System.out.println("CVV: " + cvv);
        showSummary();
    }
}
// UPI Payment (additional subclass example)
class UPIPayment extends Payment {
    private String upiId;
    public void setUpiId(String id) {
        upiId = id;
    }
    @Override
    public void processPayment() {
        System.out.println("\nProcessing UPI Payment:");
        System.out.println("UPI ID: " + upiId);
        showSummary();
    }
}
public class PaymentTest {
    public static void main(String[] args) {
        // Credit Card Payment
        CreditCardPayment creditCard = new CreditCardPayment();
        creditCard.setAmount(1500);
        creditCard.setCardDetails("1234-5678-9876-5432", "123");
        creditCard.processPayment();
        // UPI Payment
        UPIPayment upi = new UPIPayment();
        upi.setAmount(500);
        upi.setUpiId("ali@upi");
        upi.processPayment();
    }
}