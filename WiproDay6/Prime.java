public class Prime {
	public int isPrime (int input1) {
		if (1 == input1) return 1;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				
				return 1;
			}
		}
		
		
		return 2;
	}
}