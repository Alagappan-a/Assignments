
public class TaskDeliver {
	public static void main(String args[]) {
		String str[] = { "task1", "task2", "task3", "task4", "task5" };
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 0) {
				System.out.println("Ram to handle " + str[i]);
			} else
				System.out.println("suresh to handle " + str[i]);
		}
	}
}
