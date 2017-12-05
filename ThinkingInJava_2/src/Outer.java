//: Create inner class

public class Outer {

	/**
	 * @param args
	 */
	class Inner {
		private String s = new String("Who am I?");

		void outputStr() {
			System.out.println(s);
		}

		void sentenceOutput() {
			System.out.println("You are beautiful");
		}
	}

	Inner returnInner() {
		return new Inner();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		Outer.Inner inner = out.returnInner();
		// Outer.Inner inner2 = new Outer.(new Inner());
		inner.outputStr();
	}

}
