public class IsEven {
    public static int isEven(int number) {
        if (number % 2 == 0)
            return 2;         
	else
            return 1;     
	}

    public static void main(String[] args) {
        System.out.println(isEven(10));     }
}
