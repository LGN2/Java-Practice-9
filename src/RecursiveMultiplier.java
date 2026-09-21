import java.util.Scanner;

public class RecursiveMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid first number.");
            scanner.close();
            return;
        }
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        if (!scanner.hasNextInt()) System.out.println("Invalid second number.");
        else System.out.println("Product: " + multiply(firstNumber, scanner.nextInt()));
        scanner.close();
    }

    public static int multiply(int firstNumber, int secondNumber) {
        if (secondNumber == 0) return 0;
        if (secondNumber < 0) return -multiply(firstNumber, -secondNumber);
        return firstNumber + multiply(firstNumber, secondNumber - 1);
    }
}
