public class EvenOddCount {
    public static void countEvenOdd(int a, int b, int c, int d, int e) {
        int even = 0, odd = 0;
        int[] arr = {a, b, c, d, e};

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }

    public static void main(String[] args) {
        countEvenOdd(1, 2, 3, 4, 5); 
            }
}
