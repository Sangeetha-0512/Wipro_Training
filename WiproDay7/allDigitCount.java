public class allDigitCount{

    public static int[] allDigitCount(int number) {
        int[] digitCount = new int[10];         
        number = Math.abs(number);

      
        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }

        return digitCount;
    }

    public static void main(String[] args) {
        int number = 678987690;

        int[] counts = allDigitCount(number);

              for (int i = 0; i < counts.length; i++) {
            System.out.println("Digit " + i + ": " + counts[i]);
        }
    }
}
