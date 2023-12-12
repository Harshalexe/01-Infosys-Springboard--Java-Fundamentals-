public class ChocolateTester {
    public static void main(String[] args) {
        // Create an object of chocolate using the constructor
        Chocolate myChocolate = new Chocolate();

        // Use getter methods to display the default values
        System.out.println("Default Values:");
        displayChocolateDetails(myChocolate);

        // Use setter methods to modify the values
        myChocolate.setBarCode(102);
        myChocolate.setName("Hershey's");
        myChocolate.setWeight(24);
        myChocolate.setCost(50);

        // Use getter methods to display the modified values
        System.out.println("\nModified Values:");
        displayChocolateDetails(myChocolate);
    }

    // Helper method to display chocolate details
    private static void displayChocolateDetails(Chocolate chocolate) {
        System.out.println("Bar Code: " + chocolate.getBarCode());
        System.out.println("Name: " + chocolate.getName());
        System.out.println("Weight: " + chocolate.getWeight());
        System.out.println("Cost: " + chocolate.getCost());
    }
}