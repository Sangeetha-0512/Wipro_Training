public class DigitSumOpt {
    public static int digitSumOpt(int n, int flag) {
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (flag == 0 && digit % 2 == 0)
                sum += digit;
            else if (flag == 1 && digit % 2 != 0)
                sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 123456;
        System.out.println("Sum of even digits: " + digitSumOpt(n, 0));         	System.out.println("Sum of odd digits: " + digitSumOpt(n, 1));      }
}
