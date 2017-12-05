import java.util.Scanner;

public class Fibonacci {

	/**
	 * @param args
	 */
	// System.out.println("Please input a num:");
	// int i = 1;
	int[] series;

	public int[] fplus(int num) {
		series = new int[num];
		if (num == 1) {
			series[0] = 1;
			return series;
		} else if (num == 2) {
			series[0] = 1;
			series[1] = 1;
			return series;
		} else {
			series[0] = 1;
			series[1] = 1;
			for (int k = 2; k < num; ++k) {
				series[k] = series[k - 1] + series[k - 2];
			}
			return series;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input a number:");
		Scanner sc = new Scanner(System.in);
		int inputnum = sc.nextInt();
		if (inputnum < 1) {
			System.out.println("Error input");
			sc.close();
			return;
		}
		Fibonacci fb = new Fibonacci();
		for (int m = 0; m < inputnum; ++m) {
			System.out.print(fb.fplus(inputnum)[m] + " ");
		}
		sc.close();
	}

}
