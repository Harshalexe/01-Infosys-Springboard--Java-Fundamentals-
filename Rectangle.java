public class Rectangle {
    // Private instance variables
    private int length;
    private int breadth;

    // Setter method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Getter method for length (if needed)
    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    // Example method to calculate the area of the rectangle
    public int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle myRectangle = new Rectangle();

        // Use setter methods to initialize instance variables
        myRectangle.setLength(5);
        myRectangle.setBreadth(8);

        // Example: Print the area of the rectangle
        System.out.println("Area of the rectangle: " + myRectangle.calculateArea());
    }
}
