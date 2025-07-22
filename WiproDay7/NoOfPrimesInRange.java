public class NoOfPrimesInRange {

    public static int getNoOfPrimesInRange(int start, int end) {
        int count = 0;

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int input1 = 10;
        int input2 = 20;

        int result = getNoOfPrimesInRange(input1, input2);
        System.out.println("Number of prime numbers: " + result);
    }
}
