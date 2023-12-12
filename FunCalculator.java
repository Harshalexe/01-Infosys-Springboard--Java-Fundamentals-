import java.util.Scanner;

public class FunCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1 for Armstrong, 2 for Lucky): ");
        int choice = scanner.nextInt();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        switch (choice) {
            case 1:
                checkArmstrongNumber(number);
                break;
            case 2:
                checkLuckyNumber(number);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

    private static void checkArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        System.out.println(sum == originalNumber ? originalNumber + " is an Armstrong number." : originalNumber + " is not an Armstrong number.");
    }

    private static void checkLuckyNumber(int number) {
        int sumOfSquares = 0;
        int position = 2;

        while (number > 0) {
            int digit = number % 10;
            if (position % 2 == 0) sumOfSquares += Math.pow(digit, 2);
            number /= 10;
            position++;
        }

        System.out.println(sumOfSquares % 9 == 0 ? "The number is a Lucky number." : "The number is not a Lucky number.");
    }
}