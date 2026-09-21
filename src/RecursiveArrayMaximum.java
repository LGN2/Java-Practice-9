import java.util.Scanner;

public class RecursiveArrayMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner);
        if (numbers != null) System.out.println("Maximum value: " + findMax(numbers, 0));
        scanner.close();
    }

    public static int findMax(int[] numbers, int index) {
        return 0;
    }

    private static int[] readArray(Scanner scanner) {
        System.out.print("Enter array size: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid array size.");
            return null;
        }
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("At least one array value is required.");
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
