import java.util.Scanner;

public class PrintNumbersUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        if (!scanner.hasNextInt()) System.out.println("Invalid input. Please enter an integer.");
        else {
            int number = scanner.nextInt();
            if (number <= 0) System.out.println("Please enter a number greater than zero.");
            else printUp(number);
        }
        scanner.close();
    }

    public static void printUp(int number) {
        if (number <= 0) return;
        printUp(number - 1);
        System.out.println(number);
    }
}
