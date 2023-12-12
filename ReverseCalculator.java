import java.util.Scanner;

public class ReverseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse using while loop
        System.out.println("Output(while loop):");
        reverseWithWhileLoop(number);

        // Reverse using for loop
        System.out.println("Output(for loop):");
        reverseWithForLoop(number);

        // Reverse using do-while loop
        System.out.println("Output(do-while loop):");
        reverseWithDoWhileLoop(number);

        scanner.close();
    }

    private static void reverseWithWhileLoop(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }

    private static void reverseWithForLoop(int number) {
        int reversedNumber = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }

    private static void reverseWithDoWhileLoop(int number) {
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);
        System.out.println("Reversed number: " + reversedNumber);
    }
}