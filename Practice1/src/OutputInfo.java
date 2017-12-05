import java.util.Scanner;
public class OutputInfo {

	/**
	 * @param args
	 */
	static String bookname = "《Java从入门到精通》";
	static String stn = "是我学习Java语言的最佳书籍";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bookname);
		System.out.println(stn);
		
		Scanner sc = new Scanner(System.in);  //采用Scanner可读入输入的各种类型
		System.out.println("请输入第一个整数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();
		System.out.println("和为" + (x+y));
		System.out.println("差为" + (x-y));
		System.out.println("积为" + (x*y));
		System.out.println("商为" + (x/y));
		sc.close();                      //关闭输入流，否则会警告资源泄露，sc未关闭
	}
}
