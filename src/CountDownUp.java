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
        if (number <= 0) return;
        System.out.println(number);
        countDownUp(number - 1);
        if (number > 1) System.out.println(number);
    }
}
