
public class FibonacciSeries {

	public static void printFibonacci(int first, int second, int maxNumber) {
		System.out.print(first == 0 && maxNumber >= 0 ? first : "");
		System.out.print(first == 0 && maxNumber >= 1 ? "," + second : "");
		int nextNumber = first + second;
		if (nextNumber < maxNumber) {
			System.out.print(","+ nextNumber );
			printFibonacci(second, nextNumber, maxNumber);
		}
	}

	public static void main(String[] args) {
		printFibonacci(0, 1, 7);
	}

}
