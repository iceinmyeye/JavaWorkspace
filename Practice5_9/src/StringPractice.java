import java.util.Scanner;

public class StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������ַ���str1�е���ĸ�ֱ�ȫ��ת��ΪСд�ʹ�д
		System.out.println("�������ַ���1��");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("ת��ΪСд��ĸΪ" + str1.toLowerCase());
		System.out.println("ת��Ϊ��д��ĸΪ" + str1.toUpperCase());
		
		//������1��10׷�ӵ��ַ���2�ĺ���
		System.out.println("�������ַ���2��");
		String str2 = sc.nextLine();
		StringBuilder bld = new StringBuilder(str2);
		for (int i=1;i<10;++i)
		{
			//char j = (char)i;
			bld.append(i);
		}
		System.out.println("�ַ���2׷��1��10��Ϊ"+bld.toString());
		
		//�ж�str1��str2ǰ�����ַ��Ƿ���ͬ
		if (str1.substring(0,2)==str2.substring(0, 2))
		{
			System.out.println("str1��str2ǰ�����ַ���ͬ");
		}
		else
		{
			System.out.println("str1��str2ǰ�����ַ���ͬ");
		}
		
		//�ж�������ֻ����Ƿ����
		System.out.println("�������ֻ��ţ�");
		String strNo = sc.nextLine();
		String teleForm1 = "\\d{11}";
		String teleForm2 = "\\d{7}";
		String teleForm3 = "\\d{10}";
		System.out.println((strNo.matches(teleForm1)||strNo.matches(teleForm2)
				||strNo.matches(teleForm3))?"���ֻ��źϷ�":"���ֻ��Ų��Ϸ�");
		sc.close();
	}
}
