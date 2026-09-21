import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!scanner.hasNextLong()) System.out.println("Invalid input. Please enter an integer.");
        else System.out.println("Sum of digits: " + sumDigits(scanner.nextLong()));
        scanner.close();
    }

    public static long sumDigits(long number) {
        return 0;
    }
}
