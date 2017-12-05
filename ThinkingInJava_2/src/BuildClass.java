class NumberA {
	NumberA(String str) {
		System.out.println("You are so " + str);
	}
}

class NumberB {
	NumberB() {
		System.out.println("Do you really think so?");
	}
}

class NumberC extends NumberA {
	//super("Excellent");
	NumberC() {
		super("Excellent");
		// TODO Auto-generated constructor stub
	}

	NumberB nb = new NumberB();
}

public class BuildClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NumberC();

	}

}
