public class MostFrequentDigit {
    public static int getMostFrequentDigit(int input1, int input2, int input3, int input4) {
        int[] freq = new int[10];
        int[] inputs = {input1, input2, input3, input4};

        for (int num : inputs) {
            num = Math.abs(num);
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

        int maxFreq = 0;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq || (freq[i] == maxFreq && i > result)) {
                maxFreq = freq[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMostFrequentDigit(123, 456, 789, 123)); 
    }
}
