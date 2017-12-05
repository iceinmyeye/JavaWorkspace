import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {

		/**
		 * 在这些例子中，b, c, d都只是a的引用，这些引用指向同一个对象
		 */
		int[] a = { 1, 3, 6, 7, 8, 10 };
		int[] b = a;
		int[] c = { 1, 5 };
		int[] aa = new int[a.length];
		System.arraycopy(a, 0, aa, 0, aa.length);
		c = a;
		int[] d = { 1, 2, 5, 6, 8, 9, 45, 56, 23, 15, 4, 8, 6, 2, 5, 9, 71 };
		d = a;
		d[0] = 0;
		b[1] = 0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(aa));
		
	}
}
