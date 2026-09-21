import java.util.Scanner;

public class RecursiveStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("String length: " + length(text));
        scanner.close();
    }

    public static int length(String text) {
        if (text.isEmpty()) return 0;
        return 1 + length(text.substring(1));
    }
}
