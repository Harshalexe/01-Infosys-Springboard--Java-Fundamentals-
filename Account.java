public class Account {
  private double balance = 1000000000000.00;    // State/variable
  public double getBalance(int accountId) { // Behaviour/method
    return balance;
  }
  public static void main(String[] args) {    // main method
    Account accnt = new Account();            // Object creation
    double value = accnt.getBalance(123456);  // Method invocation
    System.out.println("The balance is: " + value);
  }
}
