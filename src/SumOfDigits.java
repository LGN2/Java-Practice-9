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
        number = Math.abs(number);
        if (number == 0) return 0;
        return number % 10 + sumDigits(number / 10);
    }
}
