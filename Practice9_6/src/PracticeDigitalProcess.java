import java.text.DecimalFormat;

public class PracticeDigitalProcess {

	/**
	 * @param args
	 */
	//��ȡnum1��num2֮���6��ż����������num2�����������
	//int[] s = new int[5];
	//int s[] = {0,0,0,0,0,0};
	public int GetSixEven(double num1, double num2){
		int sum = 0;
		for (int i=0;i<5;++i){
			int x = (int)num1 + (int)(Math.random()*(num2-num1));
			if (x%2==0){
				sum += x;
				//System.out.println(x);  �����������֤xֵ�������
			}
			else{
				sum += x+1;
				//System.out.println(x+1);  �����������֤xֵ�������
			}
		}
		return sum;
	}
	
	//����һ����Բ����ķ�����������������5ΪС��
	public String CircleArea(double radius){
		DecimalFormat df = new DecimalFormat("#.#####");
		return df.format(Math.PI * Math.pow(radius, 2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeDigitalProcess pdp = new PracticeDigitalProcess();
		System.out.println("2-32֮�����������6��ż��֮��Ϊ" + pdp.GetSixEven(2, 32));
		System.out.println("�뾶Ϊ2.5��Բ�����Ϊ" + pdp.CircleArea(2.5));

	}

}
