public class PalindromeString {
    public static int isPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        StringBuilder rev = new StringBuilder(input).reverse();
        if (input.equals(rev.toString())) return 2; 
        else return 1; 
    }

    public static void main(String[] args) {
        String input = "Malayalam";
        System.out.println(isPalindrome(input)); 
    }
}
