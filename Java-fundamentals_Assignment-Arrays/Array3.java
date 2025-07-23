public class Array3{

	public static void main(String[] args) {
		int[] arr= {5, 4, 3, 9, 1, 7, 9};
		int a= 9;
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if arr[i] == a{
				index = i + 1;
				break;
			}
		}

		System.out.println(index);
	}

}