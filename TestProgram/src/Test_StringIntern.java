
public class Test_StringIntern {

	public static void main(String[] args) {
		String str1 = new StringBuilder("Computer").append("Science").toString();
		String str3 = "ComputerScience";
		String str5 = new String("CoumpuerScience");
		System.out.println(str1.intern() == str1);
		System.out.println(str5 == str3);
		System.out.println(str1.equals(str3));
		
		String str6 = new String("Nanometer");
		System.out.println(str6.intern() == str6);
	}

}
