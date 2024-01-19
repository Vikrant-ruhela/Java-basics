import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        int i;
        sc.close();

        //by this loop i'm comparing first and last characters
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("This is not a Palindrome String");
                break;
            }
        }
        
        //if loops runs without break then each character is matched with it's corresponding character
         if (i == s.length()) {
            System.out.println("This is a Palindrome String");
        }
    }
}
