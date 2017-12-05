
public class Test_assert {
	
	public static void main(String[] args) {
		int a = -1;
		a = 9;
		assert a > 0 : "a is less than zero";
		System.out.println("exit");
	}
}
