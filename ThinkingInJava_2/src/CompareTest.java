class Dog {
	String name;
	String says;

	public Dog(String name, String says) {
		this.name = name;
		this.says = says;
	}
}

public class CompareTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog lady = new Dog("spot", "Ruff!");
		Dog girl = new Dog("scruffy", "Wuff!");
		System.out.println(lady.name + " " + lady.says);
		System.out.println(girl.name + " " + girl.says);

		Dog youngLady = new Dog("spot", "Ruff");
		//youngLady = lady;
		System.out.println(lady.name == youngLady.name);
		System.out.println(lady.name.equals(youngLady.name));
		//int i = 10;
//		boolean j = boolean(i);
//		if (i) {
//			System.out.println(lady.name + " " + lady.says);
//		}
	}

}
