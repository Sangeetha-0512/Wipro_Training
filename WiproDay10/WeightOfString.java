public class WeightOfString {
    public static int getWeight(String input1, int input2) {
        int total = 0;
        input1 = input1.toLowerCase();

        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (input2 == 1 && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    total += (int) ch + 1;
                } else {
                    total += (int) ch;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(getWeight("Hello World", 1)); 
        System.out.println(getWeight("Hello World", 0)); 
    }
}
