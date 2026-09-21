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
        return 0;
    }

    private static boolean isVowel(char character) {
        return character == 'a' || character == 'e' || character == 'i'
                || character == 'o' || character == 'u';
    }
}
