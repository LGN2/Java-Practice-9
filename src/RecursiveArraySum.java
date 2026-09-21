import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner);
        if (numbers != null) System.out.println("Array sum: " + sumArray(numbers, 0));
        scanner.close();
    }

    public static int sumArray(int[] numbers, int index) {
        if (index >= numbers.length) return 0;
        return numbers[index] + sumArray(numbers, index + 1);
    }

    private static int[] readArray(Scanner scanner) {
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid array size.");
            return null;
        }
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Array size cannot be negative.");
            return null;
        }
        int[] numbers = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid array value.");
                return null;
            }
            numbers[index] = scanner.nextInt();
        }
        return numbers;
    }
}
