import java.util.Scanner;
public class OutputInfo {

	/**
	 * @param args
	 */
	static String bookname = "��Java�����ŵ���ͨ��";
	static String stn = "����ѧϰJava���Ե�����鼮";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bookname);
		System.out.println(stn);
		
		Scanner sc = new Scanner(System.in);  //����Scanner�ɶ�������ĸ�������
		System.out.println("�������һ��������");
		int x = sc.nextInt();
		System.out.println("������ڶ���������");
		int y = sc.nextInt();
		System.out.println("��Ϊ" + (x+y));
		System.out.println("��Ϊ" + (x-y));
		System.out.println("��Ϊ" + (x*y));
		System.out.println("��Ϊ" + (x/y));
		sc.close();                      //�ر�������������ᾯ����Դй¶��scδ�ر�
	}
}
