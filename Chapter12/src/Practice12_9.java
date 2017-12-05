
//�Զ����쳣��
class MyException extends Exception{
	public MyException(String ErrorMessage){
		super(ErrorMessage);   //���๹�췽����Ҫ��super�ؼ�����ʾ����
	}
}

//��鲢�׳��쳣
class Student{
	int speak(int m) throws MyException{
		if(m > 1000){
			throw new MyException("����ֵ����1000");
		}
		return m;
	}
}

public class Practice12_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try����а������ǿ��ܷ����쳣��java���
		//��try������е���䷢�����쳣������ͻ�ת��catch�������ִ��
		try{
			Student stu = new Student();
			int result = stu.speak(1001);
			System.out.println("�����������"+result);
		}
		
		//catch���������ȡ�쳣��Ϣ
		//eΪMyException���͵Ĳ���
		catch(MyException e){
			System.out.println(e);
		}
		
		//���۳��������쳣����������ִ��finally���
		finally{
			System.out.println("����ִ����ϣ�");
		}
	}

}
