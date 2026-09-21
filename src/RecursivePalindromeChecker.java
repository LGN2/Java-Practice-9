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
        return false;
    }
}
