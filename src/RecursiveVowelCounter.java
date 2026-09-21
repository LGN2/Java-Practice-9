import java.util.Scanner;

public class RecursiveVowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        System.out.println("Number of vowels: " + countVowels(text));
        scanner.close();
    }

    public static int countVowels(String text) {
        if (text.isEmpty()) return 0;
        char character = Character.toLowerCase(text.charAt(0));
        int currentVowel = isVowel(character) ? 1 : 0;
        return currentVowel + countVowels(text.substring(1));
    }

    private static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u';
    }
}
