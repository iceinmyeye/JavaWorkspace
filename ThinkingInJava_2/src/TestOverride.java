class Lady{
	public void describe(){
		System.out.println("The lady's beauty is beyond description");
	}
	public void describe(String ad){
		System.out.println("The lady is " + ad);
	}
	public void describe(String ad1, String ad2){
		System.out.println("The lady is both " + ad1 + " and " + ad2);
	}
}
public class TestOverride {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lady lady = new Lady();
		lady.describe();
		lady.describe("lovely");
		lady.describe("sweet");
		lady.describe("nice", "sexy");

	}

}
