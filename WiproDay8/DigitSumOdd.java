public class DigitSumOdd {
    public static int digitSumOdd(int n) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0)
                sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.println("Sum of odd digits: " + digitSumOdd(n)); 
    }
}
