class Amphibian {
	void outputStr(String str) {
		System.out.println("I miss " + str);
	}

	void common(Amphibian amp) {
		amp.outputStr("charming");
	}
}

class Frog extends Amphibian {
	// String s = new String("Who are you?");
	void outputStr(String str) {
		System.out.println(str);
	}
}

public class OverrideTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Frog fr = new Frog();
		new Amphibian().common(new Frog());
		new Amphibian().outputStr("SHE");

	}

}
