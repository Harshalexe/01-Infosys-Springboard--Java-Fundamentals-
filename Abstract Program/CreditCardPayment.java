// CreditCardPayment.java
public class CreditCardPayment extends RRPaymentServices {
    private static int counter = 2000; // starting point for paymentID
    private double cashBack;
    private double balanceDue;

    @Override
    public void payBill(double amount) {
        if (amount >= balance) {
            cashBack = amount - balance;
            counter++;
            System.out.println("Payment Successful! Your Payment ID: C" + counter);
            System.out.println("Cashback: " + cashBack);
        } else {
            balanceDue = balance - amount;
            System.out.println("Payment Successful! Your Payment ID: C" + counter);
            System.out.println("Remaining Balance Due: " + balanceDue);
        }
    }
}
