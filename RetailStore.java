public class RetailStore {
    public static void main(String[] args) {
        // Input values for the first customer
        int billId1 = 1001;
        int customerId1 = 101;
        double discount1 = 2.0; // 2%
        double billAmount1 = 199.99;

        // Calculate discounted bill amount for the first customer
        double discountedBillAmount1 = calculateDiscountedBillAmount(billAmount1, discount1);

        // Print details for the first customer
        printBillDetails(billId1, customerId1, discountedBillAmount1);

        System.out.println(); // Add a line break for better readability

        // Input values for the second customer
        int billId2 = 1002;
        int customerId2 = 102;
        double discount2 = 4.0; // 4%
        double billAmount2 = 210.5;

        // Calculate discounted bill amount for the second customer
        double discountedBillAmount2 = calculateDiscountedBillAmount(billAmount2, discount2);

        // Print details for the second customer
        printBillDetails(billId2, customerId2, discountedBillAmount2);
    }

    // Method to calculate discounted bill amount
    private static double calculateDiscountedBillAmount(double billAmount, double discount) {
        return billAmount - billAmount * (discount / 100);
    }

    // Method to print bill details
    private static void printBillDetails(int billId, int customerId, double discountedBillAmount) {
        System.out.println("Bill ID: " + billId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Discounted Bill Amount: $" + discountedBillAmount);
    }
}