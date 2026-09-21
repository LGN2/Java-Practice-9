import java.util.Scanner;

public class CountDownUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
        } else {
            int number = scanner.nextInt();
            if (number <= 0) System.out.println("Please enter a number greater than zero.");
            else countDownUp(number);
        }
        scanner.close();
    }

    public static void countDownUp(int number) {
        System.out.println("Recursive countdown and count-up will be added next.");
    }
}
