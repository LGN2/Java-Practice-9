import java.util.Scanner;

public class PowerOfTwoChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!scanner.hasNextLong()) System.out.println("Invalid input. Please enter an integer.");
        else System.out.println("Power of two: " + isPowerOfTwo(scanner.nextLong()));
        scanner.close();
    }

    public static boolean isPowerOfTwo(long number) {
        return false;
    }
}
