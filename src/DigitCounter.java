import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        if (!scanner.hasNextLong()) System.out.println("Invalid input. Please enter an integer.");
        else {
            long number = scanner.nextLong();
            if (number < 0) System.out.println("Please enter a positive number.");
            else System.out.println("Number of digits: " + countDigits(number));
        }
        scanner.close();
    }

    public static int countDigits(long number) {
        return 0;
    }
}
