public class Main {
    public static int isPrime(int num) {
        if (num <= 1) return 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return 0;
        }
        return 1;
    }

    public static int nthPrime(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num) == 1) {
                count++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println("The " + n + "th prime number is: " + nthPrime(n));
    }
}
