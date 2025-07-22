public class NonRepeatedDigitsCount {

    public static int getNonRepeatedDigitsCount(int input) {
        int[] digitFreq = new int[10];         
        input = Math.abs(input);

        while (input > 0) {
            int digit = input % 10;
            digitFreq[digit]++;
            input /= 10;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (digitFreq[i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int number = 121;
        int result = getNonRepeatedDigitsCount(number);
        System.out.println("Non-repeated digit count: " + result);
    }
}
