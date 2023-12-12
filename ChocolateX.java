class Chocolate {
    private int barCode;
    private String name;
    private int weight;
    private int cost;

    // Constructor to initialize the default values
    public Chocolate() {
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10;
    }

    // Getter methods
    public int getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    // Setter methods to modify values
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
