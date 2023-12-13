// ShoppingPayment.java
public class ShoppingPayment extends RRPaymentServices {
    private static int counter = 1000; // starting point for paymentID

    @Override
    public void payBill(double amount) {
        if (amount == balance) {
            counter++;
            System.out.println("Payment Successful! Your Payment ID: S" + counter);
        } else {
            System.out.println("Invalid payment amount. Please enter the correct amount.");
        }
    }
}
