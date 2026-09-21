import java.util.Scanner;

public class RecursiveEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (!scanner.hasNextInt()) System.out.println("Invalid input. Please enter an integer.");
        else System.out.println("Even number: " + isEven(scanner.nextInt()));
        scanner.close();
    }

    public static boolean isEven(int number) {
        if (number < 0) return isEven(-number);
        if (number == 0) return true;
        if (number == 1) return false;
        return isEven(number - 2);
    }
}
