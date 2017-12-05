
public class Test2 {

	public static void main(String[] args) {
//		Integer x = 1, y = 3;
		Integer x = new Integer(1);
		Integer y = new Integer(3);
		int z = function1(x, y);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		System.out.println("---------------------------------");
		
		int[] xx = {5, 6};
		int zz = function2(xx);
		System.out.println(xx[0]);
		System.out.println(xx[1]);
		System.out.println(zz);
	}

	private static int function1(Integer x, Integer y) {
		x = new Integer(3);
		y = new Integer(6);
		return 9;
	}
	
	private static int function2(int[] xx) {
		xx[0]++;
		xx[1]++;
		return xx[0] + xx[1];
	}

}
