public class ExactMultiple {
    public static int isMultiple(int N, int M) {
        if (M == 0) return 1; 
        if (N % M == 0)
            return 2; 
        else
            return 1; 
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(20, 5)); 
    }
}
