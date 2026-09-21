import java.util.Scanner;

public class RecursivePalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Palindrome: " + isPalindrome(word));
        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
