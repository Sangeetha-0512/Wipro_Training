import java.util.Scanner;

public class flow1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		
		if (x < 0)
			System.out.println("Negative");
		else if (x == 0)
			System.out.println("Zero");
		else
			System.out.println("Positive");

		sc.close();
	}
}
