public class UniqueDigitsCount {

    public static int getUniqueDigitsCount(int input) {
        boolean[] seen = new boolean[10];         int count = 0;

        input = Math.abs(input); 
        while (input > 0) {
            int digit = input % 10;

            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }

            input /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 12123;
        int result = getUniqueDigitsCount(number);
        System.out.println("Unique digits count: " + result);
    }
}
