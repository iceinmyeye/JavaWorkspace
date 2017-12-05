import java.util.Scanner;

public class StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将输入的字符串str1中的字母分别全部转换为小写和大写
		System.out.println("请输入字符串1：");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("转换为小写字母为" + str1.toLowerCase());
		System.out.println("转换为大写字母为" + str1.toUpperCase());
		
		//将数字1到10追加到字符串2的后面
		System.out.println("请输入字符串2：");
		String str2 = sc.nextLine();
		StringBuilder bld = new StringBuilder(str2);
		for (int i=1;i<10;++i)
		{
			//char j = (char)i;
			bld.append(i);
		}
		System.out.println("字符串2追加1到10后为"+bld.toString());
		
		//判断str1与str2前三个字符是否相同
		if (str1.substring(0,2)==str2.substring(0, 2))
		{
			System.out.println("str1与str2前三个字符相同");
		}
		else
		{
			System.out.println("str1与str2前三个字符不同");
		}
		
		//判断输入的手机号是否合理
		System.out.println("请输入手机号：");
		String strNo = sc.nextLine();
		String teleForm1 = "\\d{11}";
		String teleForm2 = "\\d{7}";
		String teleForm3 = "\\d{10}";
		System.out.println((strNo.matches(teleForm1)||strNo.matches(teleForm2)
				||strNo.matches(teleForm3))?"该手机号合法":"该手机号不合法");
		sc.close();
	}
}
