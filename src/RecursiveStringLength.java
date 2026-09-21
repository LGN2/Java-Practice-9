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
        return 0;
    }
}
