public class Array11{
    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 1};
        boolean result = true;

        for (int num : arr) {
            if (num != 1 && num != 4) {
                result = false;
                break;
            }
        }

        System.out.println("only14: " + result);
    }
}
