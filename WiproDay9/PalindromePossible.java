public class PalindromePossible {
    public static int isPalindromePossible(int input1) {
        input1 = Math.abs(input1); 
        int[] digitFreq = new int[10]; 
        
        while (input1 > 0) {
            int digit = input1 % 10;
            digitFreq[digit]++;
            input1 /= 10;
        }

        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            if (digitFreq[i] % 2 != 0) {
                oddCount++;
            }
        }

        
        if (oddCount > 1) return 1;         	else return 2;             
    }

    public static void main(String[] args) {
        int input = 1234;
        int result = isPalindromePossible(input);
        System.out.println(result);     }
}
