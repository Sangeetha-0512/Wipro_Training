public class DigitSumEven {
    public static int digitSumEven(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0)
                sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.println("Sum of even digits: " + digitSumEven(n));     }
}
