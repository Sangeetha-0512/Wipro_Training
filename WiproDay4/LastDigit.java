public class LastDigit {
    public static int getLastDigit(int number) {
        number = Math.abs(number);
        return number % 10;
    }

    public static void main(String[] args) {
        System.out.println(getLastDigit(235)); 
    }
}
