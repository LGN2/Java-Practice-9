import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.print("Enter one character: ");
        String targetInput = scanner.nextLine();
        if (targetInput.isEmpty()) System.out.println("A target character is required.");
        else System.out.println("Occurrences: " + countChar(text, targetInput.charAt(0)));
        scanner.close();
    }

    public static int countChar(String text, char target) {
        if (text.isEmpty()) return 0;
        int currentMatch = text.charAt(0) == target ? 1 : 0;
        return currentMatch + countChar(text.substring(1), target);
    }
}
