
class outerclass{
	//����������Ա����
	private static int a = 1;            //���徲̬��Ա����
	innerclass ic = new innerclass();   //�ⲿ�಻��ֱ�ӷ����ڲ����Ա��
	double x = ic.y/2;                  //����ʵ������ͨ���������õ���
	
	//�����˼�������
	void printline1(){
		System.out.println("I love");
	}
	void printline2(String someone){
		System.out.println(someone);
	}
	int doadd(int a, int b){
		return a+b;
	}
	
	//��Ա�ڲ���
	class innerclass{
		int c = a*2;        //�ڲ����ֱ�ӷ����ⲿ���Ա����ʹ�ⲿ���ԱΪ˽��
		double y = 2.2;
		void printsentence(){
			printline1();
			printline2("Cancan");
		}
	}
}

public class Practice11_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������д���Ϊ���ⲿ��֮��ʵ�����ڲ������
		//��һ�����ȴ����ⲿ��Ķ��󣻵ڶ�����ʹ���ⲿ��.�ڲ���ָ�����������
		outerclass oc = new outerclass();
		outerclass.innerclass ic = oc.new innerclass();
		ic.printsentence();
		
		//ʹ�������ڲ���
		//������û�����ƣ�ĩβ�ӷֺ�
		//һ�����ǳ���Ļ���һ���ӿڣ���ô�������еķ���������ʹ�������ڲ�����ʵ��
		outerclass oca = new outerclass(){
			void printline1(){
				System.out.println("I fall in love with");
			}
		};
		oca.printline1();
		oca.printline2("CC");
	}

}
