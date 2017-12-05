public class Ssum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		int i = 1;
		double y = 1;
		while (i < 21) {
			for (int k = i; k > 0; --k) {
				y = y * k;
			}
			sum = sum + 1.0 / y;
			++i;
			y = 1; // 每次计算结束y值重新置为1
		}

		System.out.println("1+1/2!……1/20!的结果是" + sum);
	}
}
