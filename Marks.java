import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        // Create an array of size 5 to store marks
        int[] marksArray = new int[5];

        // Store marks using the method
        storeMarks(marksArray);

        // Display marks using the method
        displayMarks(marksArray);
    }

    // Method to store marks in the array
    private static void storeMarks(int[] marksArray) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        // Use enhanced for loop to traverse the array and store marks
        int subjectNumber = 1;
        for (int i : marksArray) {
            System.out.print("Subject " + subjectNumber + ": ");
            marksArray[subjectNumber - 1] = scanner.nextInt();
            subjectNumber++;
        }

        scanner.close();
    }

    // Method to display marks from the array
    private static void displayMarks(int[] marksArray) {
        System.out.println("Marks for 5 subjects:");

        // Use enhanced for loop to traverse the array and display marks
        int subjectNumber = 1;
        for (int marks : marksArray) {
            System.out.println("Subject " + subjectNumber + ": " + marks);
            subjectNumber++;
        }
    }
}