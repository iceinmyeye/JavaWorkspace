import java.util.Arrays;

public class ArrayPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��arr1�е�0��3���Ƶ�arr2�����
		int arr1[] = new int[] { 9, 2, 3, 5, 4, 7, 8, 9 };
		int arr2[] = Arrays.copyOfRange(arr1, 0, 4);
		for (int i = 0; i < arr1.length; ++i) {
			System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr2.length; ++i) {
			System.out.println(arr2[i]);
		}

		// ������arr1�е���С�����
		Arrays.sort(arr1);
		System.out.println(arr1[0]);

		// �滻������λ��Ϊ2��Ԫ��
		Arrays.fill(arr1, 2, 3, 88);

		// ��һ��������к��л���
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
