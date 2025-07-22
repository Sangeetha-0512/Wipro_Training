public class Fobonacci {
	public long getFibonacci (int input1) {			if (input1 <= 0) return 0;
		if (input1 == 1) return 0;   
		if (input1 == 2) return 1;
		long x = 0;
		long y = 1;
		long z = 0;
		
		for (int i = 3; i <= input1; i++) {
			z = x + y;
			x = y;
			y = z;
		}
		
		return z;
	}
}