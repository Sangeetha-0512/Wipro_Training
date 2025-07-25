public class String9{

	public static void main(String[] args) {
		String str = "ab*cd";
		
		String[] strs = str.split(".[\\*]+.");//remove the pattern match
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);

	}

}