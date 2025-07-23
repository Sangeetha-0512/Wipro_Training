public class Flow5{

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a character as a command-line argument.");
            return;
        }

        char ch = args[0].charAt(0); 

        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            System.out.println("Alphabet");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
