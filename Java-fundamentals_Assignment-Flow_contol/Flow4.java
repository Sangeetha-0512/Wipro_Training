public class Flow4{

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two characters as command-line arguments.");
            return;
        }

     
        char x = args[0].charAt(0);
        char y = args[1].charAt(0);

        if (x < y) {
            System.out.println(x + ", " + y);
        } else {
            System.out.println(y + ", " + x);
        }
    }
}
