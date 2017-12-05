import java.util.Arrays;

public class ArrayPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 将arr1中的0到3复制到arr2并输出
		int arr1[] = new int[] { 9, 2, 3, 5, 4, 7, 8, 9 };
		int arr2[] = Arrays.copyOfRange(arr1, 0, 4);
		for (int i = 0; i < arr1.length; ++i) {
			System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr2.length; ++i) {
			System.out.println(arr2[i]);
		}

		// 将数组arr1中的最小数输出
		Arrays.sort(arr1);
		System.out.println(arr1[0]);

		// 替换数组中位置为2的元素
		Arrays.fill(arr1, 2, 3, 88);

		// 将一个数组的行和列互换
		int arr[][] = new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } };
		int arrOp[][] = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				arrOp[j][i] = arr[i][j];
				System.out.println(arrOp[j][i]);
			}
			System.out.println();
		}

	}

}
