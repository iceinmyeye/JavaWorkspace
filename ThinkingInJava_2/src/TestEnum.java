//import java.util.Scanner;
public class TestEnum {

	/**
	 * @param args
	 */
	// 创建enum类型
	public enum countries {
		America, Russia, China, Japan, Korea,
	}

	public void outputOrdinal() {
		for (countries c : countries.values()) {
			System.out.println(c + " Ordinal " + c.ordinal());
		}
	}

	public void outputDescription(countries c) {
		switch (c) {
		case America:
			System.out.println("It's the United States of Ameria");
			break;
		case China:
			System.out.println("It's my lovely country, China");
			break;
		case Russia:
			System.out.println("It's that jerk");
			break;
		case Korea:
			System.out.println("It's Korea");
			break;
		case Japan:
			System.out.println("It's Japan");
			break;
		default:
			;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestEnum te = new TestEnum();
		System.out.println("These countries are ");
		te.outputOrdinal();

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Name a country:");
		// String cty = sc.nextLine();
		te.outputDescription(countries.China);
	}

}
