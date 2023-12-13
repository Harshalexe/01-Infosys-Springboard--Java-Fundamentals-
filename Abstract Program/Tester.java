// Tester.java
public class Tester {
    public static void main(String[] args) {
        // Test for CreditCardPayment
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.balance = 5000.0;
        System.out.println("Credit Card Payment Test 1:");
        creditCardPayment.payBill(6000.0);

        CreditCardPayment creditCardPayment2 = new CreditCardPayment();
        creditCardPayment2.balance = 3000.0;
        System.out.println("\nCredit Card Payment Test 2:");
        creditCardPayment2.payBill(2000.0);

        // Test for ShoppingPayment
        ShoppingPayment shoppingPayment = new ShoppingPayment();
        shoppingPayment.balance = 1000.0;
        System.out.println("\nShopping Payment Test 1:");
        shoppingPayment.payBill(1000.0);

        ShoppingPayment shoppingPayment2 = new ShoppingPayment();
        shoppingPayment2.balance = 1500.0;
        System.out.println("\nShopping Payment Test 2:");
        shoppingPayment2.payBill(1200.0);

        ShoppingPayment shoppingPayment3 = new ShoppingPayment();
        shoppingPayment3.balance = 2000.0;
        System.out.println("\nShopping Payment Test 3:");
        shoppingPayment3.payBill(2500.0);
    }
}
