public class String3{

	public static void main(String[] args) {
		String str = "Wipro";
		int n = str.length();
		
		String repeaterword = "";
		
		if (n < 2) repeaterword = str;
		else repeaterword = str.substring(0, 2);
		
		String output = "";
		
		for (int i = 0; i < n; i++) {
			output += repeaterword;
		}
		
		System.out.println(output);

	}

}