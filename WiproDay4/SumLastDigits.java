public class SumLastDigits {
    public static int getSumLastDigits(int num1, int num2) {
        int digit1 = Math.abs(num1) % 10;
        int digit2 = Math.abs(num2) % 10;
        return digit1 + digit2;
    }

    public static void main(String[] args) {
        System.out.println(getSumLastDigits(123, 457)); 
    }
}
