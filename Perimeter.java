public class Perimeter {
    private double length;
    private double breadth;

    public void Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (getLength() + getBreadth());
        System.out.println("Perimeter: " + perimeter);
    }
}