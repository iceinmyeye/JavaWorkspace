public class Test {

	public static void main(String[] args) {

		System.out.println(new Test().sum(1, 2, 3, 5, 45));
	}

	private int sum(int... args) {
		int sum = 0;
		for (int arg : args) {
			sum += arg;
		}
		return sum;
	}
}
