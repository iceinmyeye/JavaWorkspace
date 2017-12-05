class Elements {
	public enum Test1 {
		T1("I"), T2("love"), T3("Cancan"), T4(52), T5(33);

		private String str;
		private int i = 1;

		// 定义构造方法
		private Test1() {

		}

		private Test1(String str) {
			this.str = str;
		}

		private Test1(int i) {
			this.i = i;
		}

		// 定义获取值得方法
		public String getStr() {
			return str;
		}

		public int getInt() {
			return i;
		}
	}

	public void eleout(Test1 t1) {
		switch (t1) {
		case T1:
			System.out.println(Test1.T1.getStr());
			break;
		case T2:
			System.out.println(Test1.T2.getStr());
			break;
		case T3:
			System.out.println(Test1.T3.getStr());
			break;
		case T4:
			System.out.println(Test1.T4.getInt());
			break;
		case T5:
			System.out.println(Test1.T5.getInt());
			break;
		}
	}
}

public class Practice17_23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements elt = new Elements();
		for (int i = 0; i < Elements.Test1.values().length; ++i) {
			elt.eleout(Elements.Test1.values()[i]);
		}

	}

}
