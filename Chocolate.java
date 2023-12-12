public class Chocolate {
    private String barCode;
    private String name;
    private double weight;
    private double cost;

    public Chocolate() {
        barCode = "2957398";
        name = "KitKat";
        weight = 100.0;
        cost = 1.0;
    }

    public void displayDetails() {
        System.out.println("Bar Code: " + barCode);
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Cost: $" + cost);
    }

    public static void main(String[] args) {
        Chocolate defaultChocolate = new Chocolate();
        defaultChocolate.displayDetails();
    }
}
