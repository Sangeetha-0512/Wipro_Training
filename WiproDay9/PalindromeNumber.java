public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println("Is palindrome: " + isPalindrome(num)); 
    }
}
