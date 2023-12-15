// Main.java
public class Main {
    public static void main(String[] args) {
        RoomDetails room = new RoomDetails("John Doe", "Standard", 2, 5);
        float totalBill = room.calculateBill();

        // Display details
        System.out.println("Bill Id: " + room.getBillId());
        System.out.println("Customer Name: " + room.getCustomerName());
        System.out.println("No. of days of Stay: " + room.getNoOfDaysOfStay());
        System.out.println("Total Bill: " + totalBill);
    }
}
