public class String1{

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }

        return true;      }

    public static void main(String[] args) {
        System.out.println(isPalindrome("MADAM"));   // true
        System.out.println(isPalindrome("MOM"));     // true
        System.out.println(isPalindrome("MOTHER"));  // false
    }
}
