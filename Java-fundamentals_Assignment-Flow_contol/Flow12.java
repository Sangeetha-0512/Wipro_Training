public class Flow12{

	public static void main(String[] args) {
		int no = -4;

		if (no < 0) no *= -1; // Convert to positive

		Boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(no); i++) {
			if (no % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (no == 0 || no == 1) isPrime = false;

		if (isPrime)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}
