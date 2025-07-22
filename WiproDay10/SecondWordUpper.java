public class SecondWordUpper {
    public static String getSecondWordUppercase(String input) {
        String[] words = input.trim().split(" ");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }

    public static void main(String[] args) {
        String input = "hello world java";
        System.out.println(getSecondWordUppercase(input)); 
    }
}
