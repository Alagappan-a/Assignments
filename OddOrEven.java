public class OddOrEven {
	static String[] isOddOrEven(int arr[]) {
		String str = null;
		String[] stringArray2 = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				str = arr[i] + " is odd";
				stringArray2[i] = str;
			} else {
				str = arr[i] + " is even";
				stringArray2[i] = str;
			}

		}
		return stringArray2;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4 };
		 //stringArray1 = new String[arr.length];
		 String[] stringArray1 = isOddOrEven(arr);
		  
		for (int i = 0; i < arr.length; i++) {
			System.out.println(stringArray1[i]);
		}
	}
}